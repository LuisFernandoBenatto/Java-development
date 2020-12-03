package Atividade;

public class Main {
    public static void main(String[] args) {
        testeComString();
        testeComInteger();
        testeComDouble();
    }
    public static void testeComString() {
        PILHA pilha = new PILHA();
        
        String primeiroAlf = "ABCDEFGHIJKLM";
        pilha.empilhar(primeiroAlf);
        String segundoAlf = "NOPQRSTUVWXYZ";
        pilha.empilhar(segundoAlf);
        System.out.println(pilha);
        
        pilha.desempilhar();
        System.out.println(pilha);
        pilha.desempilhar();
        System.out.println(pilha);
    }
    public static void testeComInteger() {
        PILHA pilha2 = new PILHA();
        Integer primeiro = 1;
        pilha2.empilhar(primeiro);
        Integer segundo = 2;
        pilha2.empilhar(segundo);
        System.out.println(pilha2);
        
        pilha2.desempilhar();
        System.out.println(pilha2);
        pilha2.desempilhar();
        System.out.println(pilha2);
    }
    public static void testeComDouble() {
        PILHA pilha3 = new PILHA();
        Double primeiro = 1.9999;
        pilha3.empilhar(primeiro);
        Double segundo = 2.9999;
        pilha3.empilhar(segundo);
        System.out.println(pilha3);
        
        pilha3.desempilhar();
        System.out.println(pilha3);
        pilha3.desempilhar();
        System.out.println(pilha3);
    }
}
