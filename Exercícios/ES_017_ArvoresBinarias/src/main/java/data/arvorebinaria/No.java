package data.arvorebinaria;

public class No {
    private int valor;
    private No filhoEsquerda;
    private No filhoDireita;
    
    // Opcional
    private No pai;

    public No() {
        this.valor = 0;
        this.filhoEsquerda = new No();
        this.filhoDireita = new No();     
    }
    public No(int valor, No filhoEsquerda, No filhoDireita) {
        this.valor = valor;
        this.filhoEsquerda = filhoEsquerda;
        this.filhoDireita = filhoDireita;
    } 
    public static void imprimirPreOrdem(No n) {
        System.out.print("Valor: " + n.valor + " ");
        if(n.filhoEsquerda != null) {
            imprimirPreOrdem(n.filhoEsquerda);
        }
        if(n.filhoDireita != null) {
            imprimirPreOrdem(n.filhoDireita);
        }    
    }
    public static void imprimirEmOrdem(No n) {
        if(n.filhoEsquerda != null) {
            imprimirEmOrdem(n.filhoEsquerda);
        }
        System.out.print("Valor: " + n.valor + " ");
        if(n.filhoDireita != null) {
            imprimirEmOrdem(n.filhoDireita);
        }    
    }
    public static void imprimirPosOrdem(No n) {
        if(n.filhoEsquerda != null) {
            imprimirPosOrdem(n.filhoEsquerda);
        }
        if(n.filhoDireita != null) {
            imprimirPosOrdem(n.filhoDireita);
        }    
        System.out.print("Valor: " + n.valor + " ");
    }
}
