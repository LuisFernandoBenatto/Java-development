package Exercicio_6;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        int matriz_M[][] = new int[5][5];
        int valoresDaMatriz;
        int resultado_1 = 0,
            resultado_2 = 0,
            resultado_3 = 0,
            resultado_4 = 0,
            resultado_5 = 0;
        
        System.out.println("Inserir os valores da Matriz: ");        
        for (int i = 0; i < matriz_M.length; i++) {
            for (int j = 0; j < matriz_M[0].length; j++) {
                valoresDaMatriz = scanf.nextInt();
                matriz_M[i][j] = valoresDaMatriz;
                // a) da linha 4 de M; 
                if(i == 3) {
                    resultado_1 += matriz_M[i][j];
                }
                // b) da coluna 2 de M;
                if(j == 1) {
                    resultado_2 += matriz_M[i][j];              }
                // c) da diagonal principal;
                if(i == j) {
                    resultado_3 += matriz_M[i][j];
                }
                // d) da diagonal secundária;
                if(j ==(4 - i)) {
                    resultado_4 += matriz_M[i][j];
                }               
                // e) de todos os elementos da matriz;
                resultado_5 += valoresDaMatriz;
                // f) Escreva estas somas e a matriz;
            }
        }
        for (int i = 0; i < matriz_M.length; i++) {
            for (int j = 0; j < matriz_M[0].length; j++) {
                System.out.print("  " + matriz_M[i][j] + "  ");    
            }  
            System.out.println("");
        }
        System.out.println("---------------------------------------");
        System.out.println("Soma da linha 4 da Matriz: " + resultado_1);
        System.out.println("Soma da coluna 2 da Matriz: " + resultado_2);
        System.out.println("Soma da diagonal principal da Matriz: " + resultado_3);
        System.out.println("Soma da diagonal secundária da Matriz: " + resultado_4);
        System.out.println("Soma de todos os elementos da Matriz: " + resultado_5); 
    }
}
