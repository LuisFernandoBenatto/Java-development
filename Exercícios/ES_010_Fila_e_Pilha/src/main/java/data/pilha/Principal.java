package data.pilha;

public class Principal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        
        for (int i = 0; i < 5; i++) {
            No no = new No("pilha: " + i, i);
            pilha.empilhar(no);
        }
        pilha.imprimir();
        
        pilha.desempilhar();
        pilha.imprimir();
        
        pilha.desempilhar();
        pilha.imprimir();
        
        pilha.desempilhar();
        pilha.imprimir();
        
        pilha.desempilhar();
        pilha.imprimir();
        
        pilha.desempilhar();
        pilha.imprimir();
        
        pilha.desempilhar();
        pilha.imprimir();
    }
    
}
