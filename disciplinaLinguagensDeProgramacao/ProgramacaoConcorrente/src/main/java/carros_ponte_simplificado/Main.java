package carros_ponte_simplificado;
public class Main {
    public static void main(String[] args) {
        Buffer ponte = new Buffer();
        Carro_Comum carro_comum = new Carro_Comum(ponte);
        Viatura_Policial viatura_policial = new Viatura_Policial(ponte);
        Ambulancia ambulancia = new Ambulancia(ponte);
        
        carro_comum.setPriority(5);
        viatura_policial.setPriority(7);
        ambulancia.setPriority(10);
        
        System.out.println(carro_comum.getPriority());
        System.out.println(ambulancia.getPriority());
        System.out.println(viatura_policial.getPriority());
        
        carro_comum.start();
        ambulancia.start();
        viatura_policial.start();

        System.out.println("===============================================");
    }
}
