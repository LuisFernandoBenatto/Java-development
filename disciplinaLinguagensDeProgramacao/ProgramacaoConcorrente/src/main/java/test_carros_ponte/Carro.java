package test_carros_ponte;

public class Carro extends Thread {
    Buffer ponte;
    String modelo;
    
    public Carro(Buffer ponte, String modelo) {
        this.ponte = ponte;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void run(){
        while (true){
            ponte.toEnter("Carro " + getModelo());
        }
    }
}
