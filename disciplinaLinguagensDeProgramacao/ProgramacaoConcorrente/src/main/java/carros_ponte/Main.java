package carros_ponte;

public class Main {
    public static void main(String[] args) {
        
        Buffer ponte = new Buffer(1);
        Carro_Comum carro_comum = new Carro_Comum(ponte);
        Passagem passagem = new Passagem(ponte);
        Viatura_Policial viatura_policial = new Viatura_Policial(ponte);
        Ambulancia ambulancia = new Ambulancia(ponte);
        
        carro_comum.setPriority(5);
        ambulancia.setPriority(10);
        viatura_policial.setPriority(9);
        passagem.setPriority(10);
        
        carro_comum.start();
        ambulancia.start();
        viatura_policial.start();
        passagem.start();

        System.out.println("===============================================");
    }
}
