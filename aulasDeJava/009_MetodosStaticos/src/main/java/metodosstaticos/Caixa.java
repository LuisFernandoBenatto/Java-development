package metodosstaticos;

public class Caixa {
    static int _controle;
    int _numero;
    
    public Caixa() {
        _controle++;
        _numero = _controle;
        
        System.out.println("Executando o construtor");
    }
    
    { //Bloco estático executa primeiro que o bloco do construtor
        System.out.println("Executando o bloco estático");
    }  
}
