package carros_ponte_simplificado;
public class Ambulancia extends Thread {
    Buffer ponte;
    
    public Ambulancia(Buffer ponte) {
        this.ponte = ponte;
    }

    @Override
    public void run(){
        while (true){
            ponte.toEnter("Ambulância");
        }
    }
}
