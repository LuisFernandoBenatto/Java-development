package Exercicio_I;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        
        No n = new No("Joaquim", 7.5);
        lista.inserir(n);
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        n = new No("Juvenil", 8.5);
        lista.inserir(n);
        n = new No("Marcela", 9.5);
        lista.inserir(n);
        n = new No("Diana", 8.3);
        lista.inserir(n);
        n = new No("Roberta", 9.5);
        lista.inserir(n);
        n = new No("Manoela", 4.5);
        lista.inserir(n);
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Buscando.....");
        No buscado = lista.buscar("Joaquim");
        System.out.println(buscado.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Removendo......");
        No removido = lista.remover("Manoela");
        System.out.println("Remoção: " + removido.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");   
    }  
}
