package Exercicio_IV;

public class Main {
    public static void main(String[] args) {
        PILHA pilha = new PILHA();
        
        System.out.println("PILHA");
        System.out.println("");
        
        System.out.println("Empilhando...");
        System.out.println("");
        No no = new No("Livro I", 1);
        pilha.empilhar(no);
        no = new No("Livro II", 2);
        pilha.empilhar(no);
        no = new No("Livro III", 3);
        pilha.empilhar(no);
        pilha.imprimir();
        System.out.println("");
        
        System.out.println("Desempilhar...");
        System.out.println("");
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.imprimir();
        pilha.desempilhar();
        
        System.out.println("");
        System.out.println("");
        
        FILA fila = new FILA();
        
        System.out.println("FILA");
        System.out.println("");
        
        System.out.println("Inserindo...");
        System.out.println("");
        No n = new No("Pessoa I", 1);
        fila.inserir(n);
        n = new No("Pessoa II", 2);
        fila.inserir(n);
        n = new No("Pessoa III", 3);
        fila.inserir(n);
        fila.imprimir();
        System.out.println("");
        
        System.out.println("Removendo...");
        System.out.println("");
        fila.remover();
        fila.remover();
        fila.remover();
        fila.imprimir();
        fila.remover();
    } 
}
