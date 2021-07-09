package carros_ponte;

public class Passagem extends Thread {
    Buffer ponte;
    
    public Passagem(Buffer ponte) {
        this.ponte = ponte;
    }
    
    @Override
    public void run() {
        String item;
        while(true) {
            try {
                item = ponte.toExit();
                System.out.println("-> Carro passou na ponte: " + item);
            } catch (InterruptedException ex) {}
        }
    }
}
