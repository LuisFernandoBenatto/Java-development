package Exercicio_II;

public class Main {
    public static void main(String[] args) {
        int vet[] = {
            3,12,23,34,41,44,65,71,85
        };

        System.out.println("Posição do elemento 3 = " 
                           + buscaBinaria(3, vet, 0, (vet.length - 1)));
        System.out.println("Posição do elemento 41 = " 
                          + buscaBinaria(41, vet, 0, (vet.length - 1)));
        System.out.println("Posição do elemento 71 = " 
                          + buscaBinaria(71, vet, 0, (vet.length - 1)));  
    }  
    public static int buscaBinaria( int n, int[] vet, int inicio, int fim ){
        int atual = (int) (inicio + fim)/2;
        if (vet[atual] == n) {
            return atual;
        }
        if (inicio > fim) {
            return -1;
        }
        if (vet[atual] < n) {
            return buscaBinaria(n, vet, atual+1, fim);
        }
        else {
            return buscaBinaria(n, vet, inicio, atual-1);
        }
    }
}