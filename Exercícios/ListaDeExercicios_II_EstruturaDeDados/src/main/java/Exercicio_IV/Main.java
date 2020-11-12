package Exercicio_IV;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        Estudante estudante = new Estudante("Gabriel", 
                "201911113030007", 
                10.0, 
                "Ciencia da Computacao");
        No n = new No(estudante);
        lista.inserir(n);
        
        estudante = new Estudante("Renato", 
                "201911113030071", 
                6.0, 
                "Agronomia");
        n = new No(estudante);
        lista.inserir(n);
        
        estudante = new Estudante("Manoela", 
                "201911113030129", 
                9.85, 
                "Biologia");
        n = new No(estudante);
        lista.inserir(n);
        
        
        lista.imprimir();
        lista.imprimirReverso();
        
        No estudante_1 = lista.buscaPorNome("Gabriel");
        System.out.println(estudante_1);
        
        lista.removerPorNome("Renato");
        
        lista.imprimir();
        lista.imprimirReverso();
        
        lista.removerPorNome("Manoela");
        
        lista.imprimir();
        lista.imprimirReverso();  
    }
}
