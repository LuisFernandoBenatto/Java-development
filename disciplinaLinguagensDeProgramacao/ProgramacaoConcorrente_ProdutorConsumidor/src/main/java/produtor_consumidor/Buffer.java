package produtor_consumidor;

import java.util.Objects;

public class Buffer {
    Integer buffer[];
    Integer frente, fim, tamanhoMax, tamanhoAtual; 
    
    
    public Buffer(int tamanhoMax){
        buffer = new Integer[tamanhoMax];
        this.tamanhoMax = tamanhoMax;
        frente = -1;
        fim = -1; 
        this.tamanhoAtual = 0; 
    }
    
    public synchronized void depositar(int item){
        try{
            while (Objects.equals(tamanhoAtual, tamanhoMax) ){
                System.out.println("Buffer cheio!");
                wait();  // a thread entra em espera 
            }
            fim = (fim + 1) % tamanhoMax; 
            buffer[fim] = item;
            tamanhoAtual++; 
            if (frente == -1) {
                frente = fim; 
            }
//            Thread.sleep(1000); // só para visualizar
            notifyAll();          
        }
        catch( InterruptedException e){}
    }
    
    public synchronized int retirar() throws InterruptedException{
        int item = 0;
        while (tamanhoAtual == 0){ 
            System.out.println("Buffer vazio");
            wait();   // a thread entra em espera 
        }
        item = buffer[frente];
        buffer[frente] = null;
        frente = (frente + 1) % tamanhoMax;
        tamanhoAtual--;         
//        Thread.sleep(1000); // só para visualizar
        notifyAll();
        return item; 
        
    } 
}


