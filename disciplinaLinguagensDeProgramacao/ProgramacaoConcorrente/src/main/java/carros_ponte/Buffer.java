package carros_ponte;

import java.util.Objects;

public class Buffer {
    String buffer[];
    Integer frente, fim, tamanhoMax, tamanhoAtual; 
    
    public Buffer(int tamanhoMax){
        buffer = new String[tamanhoMax];
        this.tamanhoMax = tamanhoMax;
        frente = -1;
        fim = -1; 
        this.tamanhoAtual = 0; 
    }
    
    public synchronized void toEnter(String item){
        try{
            while (Objects.equals(tamanhoAtual, tamanhoMax) ){
                System.out.println("Tem carro passando na ponte! Buffer cheio!");
                wait();  // a thread entra em espera 
            }
            fim = (fim + 1) % tamanhoMax; 
            buffer[fim] = item;
            tamanhoAtual++; 
            if (frente == -1) {
                frente = fim; 
            }
            Thread.sleep(5000); // só para visualizar
            notifyAll();          
        }
        catch( InterruptedException e){}
    }
    
    public synchronized String toExit() throws InterruptedException{
        String item = "";
        while (tamanhoAtual == 0){ 
            System.out.println("Não tem nenhum carro na ponte! Buffer vazio");
            wait();   // a thread entra em espera 
        }
        item = buffer[frente];
        buffer[frente] = null;
        frente = (frente + 1) % tamanhoMax;
        tamanhoAtual--;         
        Thread.sleep(5000); // só para visualizar
        notifyAll();
        return item;    
    } 
}


