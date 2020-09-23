package Questao_3;

public class Main {
    public static void main(String[] args) {
       Caixa newCaixa = new Caixa();
       newCaixa.setFlag(100);
       System.out.println("Antes do zerar(): " + newCaixa.getFlag());
       
       zerar(newCaixa);
       System.out.println("Depois do zerar(): " + newCaixa.getFlag());       
    }
    public static void zerar(Caixa obj) {
        obj.setFlag(0);
    }   
}
