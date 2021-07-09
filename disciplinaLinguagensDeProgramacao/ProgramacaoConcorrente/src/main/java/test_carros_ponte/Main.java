package test_carros_ponte;

public class Main {
    public static void main(String[] args) {
        
        Buffer ponte = new Buffer(1);
        Carro carro3 = new Carro(ponte, "Comum");
        Passagem passagem = new Passagem(ponte);
        Carro carro2 = new Carro(ponte, "Ambulancia");
        Carro carro1 = new Carro(ponte, "Policia");
        
        passagem.setPriority(10);
        carro1.setPriority(5);
        carro2.setPriority(10);
        carro3.setPriority(9);
//        verificarModelo(carro3);
//        verificarModelo(carro1);
//        verificarModelo(carro2);
        
        passagem.start();
        carro1.start();
        carro2.start();
        carro3.start();      
        System.out.println("===============================================");
    }
    public static void verificarModelo(Carro carro) {
        if(carro.getModelo() == "C" || carro.getModelo() == "Comum") {
            carro.setPriority(5);
        } else if(carro.getModelo() == "P" || carro.getModelo() == "Policia") {
            carro.setPriority(7);
        } else if(carro.getModelo() == "A" || carro.getModelo() == "Ambulancia") {
            carro.setPriority(10);
        }
    }
}
