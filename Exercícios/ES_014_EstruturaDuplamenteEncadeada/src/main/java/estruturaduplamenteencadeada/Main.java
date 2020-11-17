package estruturaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        No n = new No("A", 1);
        lista.inserir(n);
        n = new No("B", 2);
        lista.inserir(n);
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        
        n = new No("C", 3);
        lista.inserir(n);
        n = new No("D", 4);
        lista.inserir(n);
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
    }
    
}
