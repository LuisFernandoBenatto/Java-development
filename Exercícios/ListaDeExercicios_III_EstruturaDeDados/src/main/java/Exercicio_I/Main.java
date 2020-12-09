package Exercicio_I;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        SomaDosPrimeirosInteiros soma = new SomaDosPrimeirosInteiros();
        int n = 0; 
        System.out.println("Valor: ");
        n = scanf.nextInt();
        
        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = i;
            System.out.println("Posição: " + i + " - " + vet[i]); 
        } 
        System.out.println("Resultado: " + 
                                         soma.primeirosInteiros(vet, n));
    }   
}