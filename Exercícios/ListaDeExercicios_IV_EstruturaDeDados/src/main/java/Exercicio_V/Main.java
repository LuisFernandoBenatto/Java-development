package Exercicio_V;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        arvore.adicionarElemento(50);
        arvore.adicionarElemento(35);
        arvore.adicionarElemento(40);
        arvore.adicionarElemento(33);
        
        arvore.adicionarElemento(80);
        arvore.adicionarElemento(3);
        arvore.adicionarElemento(76);
        arvore.adicionarElemento(90);
        
        arvore.adicionarElemento(56);
        arvore.adicionarElemento(24);
        arvore.adicionarElemento(13);
        arvore.adicionarElemento(45);
        
        arvore.adicionarElemento(92);
        arvore.adicionarElemento(32);
        arvore.adicionarElemento(51);
        arvore.adicionarElemento(81);
        
        arvore.adicionarElemento(88);
      
        System.out.println("Imprimir em Ordem: ");
        arvore.imprimirEmOrdem(arvore.getRaiz());
        System.out.println("");
        System.out.println("Imprimir pos-Ordem: ");
        arvore.imprimirPosOrdem(arvore.getRaiz());
        System.out.println("");
        System.out.println("Imprimir pre-Ordem: ");
        arvore.imprimirPreOrdem(arvore.getRaiz());
    }   
}
