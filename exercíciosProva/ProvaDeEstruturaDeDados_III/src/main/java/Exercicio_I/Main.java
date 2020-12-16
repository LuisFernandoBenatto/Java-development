package Exercicio_I;

public class Main {
    public static void main(String[] args) {
        int value  = 0;
        System.out.println("Fatorial " + value + "! : " + fatorial_dinamico(value));
        value = 1;
        System.out.println("Fatorial " + value + "! : " + fatorial_dinamico(value));
        value = 4;
        System.out.println("Fatorial " + value + "! : " + fatorial_dinamico(value));
        value = 18;
        System.out.println("Fatorial " + value + "! : " + fatorial_dinamico(value));
    }
    
    static long fatorial_vet[] = new long[19];
    
    public static long fatorial_dinamico(int n) { 
        if(fatorial_vet[n] != 0) {
            return fatorial_vet[n];
        } else {
            if(n <= 1) {
                return 1;
            } else {
                fatorial_vet[n] = n * fatorial_dinamico(n - 1);
            }
            return fatorial_vet[n];
        }
    }
}
