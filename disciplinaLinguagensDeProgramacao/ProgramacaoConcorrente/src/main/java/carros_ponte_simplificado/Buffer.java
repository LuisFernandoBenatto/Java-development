package carros_ponte_simplificado;
public class Buffer extends Thread {
    boolean cheio;
    
    public Buffer() {
        this.cheio = false;
    }
    
    public synchronized void toEnter(String item){
        try{
            while(this.cheio){
                System.out.println("Tem carro passando na ponte! Buffer cheio!");
                wait();  
            }
            System.out.println("-> Carro passando na ponte: " + item);
            Thread.sleep(7000);
            this.cheio = true;
            toExit();
        }
        catch( InterruptedException e){}
    }
    
    public synchronized void toExit(){
        this.cheio = false;
        notifyAll(); 
    } 
}


