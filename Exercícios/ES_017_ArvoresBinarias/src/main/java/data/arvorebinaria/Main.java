package data.arvorebinaria;

public class Main {
    public static void main(String[] args) {
        No no = new No(15,
                new No(10, null, null),
                new No(50, new No(20, null, null), null));
        System.out.println("Pré-Ordem");
        No.imprimirPreOrdem(no);
        System.out.println("");
        System.out.println("Em-Ordem");
        No.imprimirEmOrdem(no);
        System.out.println("");
        System.out.println("Pos-Ordem");
        No.imprimirPosOrdem(no);
    }   
}
