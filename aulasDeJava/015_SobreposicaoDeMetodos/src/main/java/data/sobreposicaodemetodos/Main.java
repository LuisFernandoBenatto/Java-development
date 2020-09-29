package data.sobreposicaodemetodos;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("Ford", 2010, 100_000.00, 200);
        CaminhaoBiTrem caminhaoBiTrem = new CaminhaoBiTrem("Volvo", 2020, 120_000.00, 230, 20);
    
        System.out.println("Ipva do Caminhão: " + caminhao.calcularIpva());
        
        System.out.println("Ipva do Caminhão BiTrem: " + caminhaoBiTrem.calcularIpva());
        
        System.out.println("Valor total do Caminhão + o IPVA:  " + (caminhao.calcularIpva() + caminhao.getValor()));
        System.out.println("Valor total do  Caminhão BiTrem + o IPVA: " + (caminhaoBiTrem.calcularIpva() + caminhaoBiTrem.getValor()));
        
        System.out.println("-----------------------------------------------");
        Veiculo v  = new Veiculo("Fiat", 2020, 40_000.00);
        System.out.println(v.toString());
        
    }
    
}
