package arvorebinariaordenada;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<Integer>();
        arvore.adicionarElemento(25);
        arvore.adicionarElemento(32);
        arvore.adicionarElemento(12);
        arvore.adicionarElemento(8);
        
        arvore.adicionarElemento(5);
        arvore.adicionarElemento(9);
        arvore.adicionarElemento(20);
        arvore.adicionarElemento(10);
        
        arvore.adicionarElemento(45);
        arvore.adicionarElemento(46);
        arvore.adicionarElemento(78);
        arvore.adicionarElemento(56);
        
        arvore.adicionarElemento(88);
        arvore.adicionarElemento(71);
        arvore.adicionarElemento(1);
        arvore.adicionarElemento(54);
        
        arvore.adicionarElemento(40);
      
        
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
