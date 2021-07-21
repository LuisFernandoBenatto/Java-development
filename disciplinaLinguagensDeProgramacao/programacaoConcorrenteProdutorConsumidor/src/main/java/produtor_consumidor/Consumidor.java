package produtor_consumidor;

public class Consumidor extends Thread {
    Buffer buffer;
    
    public Consumidor(Buffer fila){
        buffer = fila; 
    }
    
    @Override
    public void run(){
        int item;
        while (true){
            try {
                item = buffer.retirar();
                System.out.println("Item retirado: "+item);
            } catch (InterruptedException ex) {}           
        }
    }
}