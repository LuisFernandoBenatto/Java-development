package carros_ponte;

public class Carro_Comum extends Thread {
    Buffer ponte;
    
    public Carro_Comum(Buffer ponte) {
        this.ponte = ponte;
    }

    @Override
    public void run(){
        while (true){
            ponte.toEnter("Carro Comum");
        }
    }
}
