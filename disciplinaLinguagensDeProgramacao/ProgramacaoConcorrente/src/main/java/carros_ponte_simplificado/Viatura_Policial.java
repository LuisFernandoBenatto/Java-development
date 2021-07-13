package carros_ponte_simplificado;
public class Viatura_Policial extends Thread {
    Buffer ponte;
    
    public Viatura_Policial(Buffer ponte) {
        this.ponte = ponte;
    }

    @Override
    public void run(){
        while (true){
            ponte.toEnter("Viatura Policial");
        }
    }
}
