package metodosstaticos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Caixa.estatico()");
    
        //Caixa c = new Caixa();
        //System.out.println(c.estatico());
        
        Caixa caixa = new Caixa();
        Caixa caixa_2 = new Caixa();
        Caixa caixa_3 = new Caixa();
        
        System.out.println("Numero da Caixa: " + caixa._numero);
        System.out.println("Numero da Caixa_2: " + caixa_2._numero);
        System.out.println("Numero da Caixa_3: " + caixa_3._numero);
        
        System.out.println("Controle -> Caixa: " + caixa._controle + " Caixa_2: " +  caixa_2._controle + " Caixa_3: " + caixa_3._controle);
    
        
    }
    
}
