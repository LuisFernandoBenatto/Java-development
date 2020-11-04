package Exercicio_II;

public class Menu {
    public static void main(String[] args) {
        ListaDinamica listaDinamica = new ListaDinamica();
        
        No n;
        System.out.println("Inserindo.....");
        n = new No("Joaquim", 195, 82, "Basquete", "Nike");
        listaDinamica.inserir(n);
        n = new No("Juvenil", 170, 65, "Natação", "Correios");
        listaDinamica.inserir(n);
        n = new No("Marcela", 160, 55, "Futsal", "Adidas");
        listaDinamica.inserir(n);
        
        listaDinamica.imprimirLista();
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Buscando.....");
        No buscado = listaDinamica.buscar("Joaquim");
        System.out.println(buscado.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Inserindo +.....");
        n = new No("Diana", 180, 73, "Vôli", "Hinode");
        listaDinamica.inserir(n);
        n = new No("Roberta", 169, 70, "HandBoll", "Gatorade");
        listaDinamica.inserir(n);
        n = new No("Manoela", 155, 61, "Boxe", "UFC");
        listaDinamica.inserir(n);
        
        listaDinamica.imprimirLista();
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Buscando.....");
        No buscado_2 = listaDinamica.buscar("Manoela");
        System.out.println(buscado_2.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Removendo......");
        No removido = listaDinamica.remover("Marcela");
        System.out.println("Remoção: " + removido.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        listaDinamica.imprimirLista();
        System.out.println("-----------------------------------------------");   
    }
}
