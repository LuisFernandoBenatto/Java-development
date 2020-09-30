package data.fila;

public class Principal {
    public static void main(String[] args) {
        FilaCircular filaCircular = new FilaCircular(4);
        
        for (int i = 0; i < 5; i++) {
            No no = new No("i: " + i, i);
            filaCircular.inserir(no);
        }
        filaCircular.imprimir();        
        System.out.println("------ Adicionou novos elementos ------");
        
        for (int i = 0; i < 6; i++) {
            No no = new No("i: " + i, i);
            filaCircular.inserir(no);
        }
        filaCircular.imprimir();
        filaCircular.remover();
        filaCircular.remover();
        filaCircular.imprimir();
        
        for (int i = 0; i < 4; i++) {
            No n = new No("i2: " + i, i);
            filaCircular.inserir(n);
        }
        filaCircular.imprimir();
        filaCircular.remover();
        filaCircular.imprimir();
    }
    
}
