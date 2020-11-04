package Exercicio_13;

public class Principal {
    public static void main(String[] args) {
        Fila fila_1 = new Fila();
        
        for (int i = 0; i < 5; i++) {
            No no = new No("i: " + i, i);
            fila_1.inserir(no);
        }
        fila_1.imprimir();        
        System.out.println("------ Adicionou novos elementos ------");
        
        for (int i = 0; i < 6; i++) {
            No no = new No("i: " + i, i);
            fila_1.inserir(no);
        }
        fila_1.imprimir();
        
        // Removendo o primeiro
        fila_1.remover();
        fila_1.imprimir();
        
        // Removendo os três primeiros
        fila_1.remover();
        fila_1.remover();
        fila_1.remover();
        fila_1.imprimir();
    }
    
}
