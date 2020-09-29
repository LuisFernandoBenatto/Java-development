package data.heranca;

public class Main {
    public static void main(String[] args) {
       Caminhao c = new Caminhao("Ford", 2010, 100_000.0, 100);
       
       Double ipva = c.calcularIpva();
       System.out.println("Valor do ipva: " + ipva);
       System.out.println("Valor do caminhão com o ipva: " + (c.getValor() + ipva));
       
       System.out.println("Marca do caminhão: " + c.getMarca());
       System.out.println("Ano do caminhão: " + c.getAno());
       System.out.println("Capacidade de carga em kg: " + c.getCapacidadeDeCarga()); 
       
       
       
       Veiculos v = new Caminhao("Ford", 2000, 50_000.0, 70);
       Veiculos v_2 = new Motocicleta();
    }
    
}
