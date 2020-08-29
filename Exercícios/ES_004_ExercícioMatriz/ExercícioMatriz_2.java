/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercíciomatriz_2;
import java.util.Scanner;
/**
 *
 * @author luis_
 */
public class ExercícioMatriz_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        int mat[][] = new int[5][5];
        /**********************************************************************/
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                mat1[j] = scanf.nextInt();
            }
        }
        /**********************************************************************/
        int result = 0;
        /**********************************************************************/
        System.out.println("(a) Calcule a soma da linha 4 da matriz: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(i == 4)
                    result += mat[i][j];
                System.out.print(mat[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println(result);
        result = 0;
        /**********************************************************************/
        System.out.println("(b) Calcule a soma da coluna 2 da matriz: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(j == 2)
                    result += mat[i][j];
                System.out.print(mat[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println(result);
        result = 0;       
        /**********************************************************************/
        System.out.println("(c) Calcule a soma da diagonal principal da matriz: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(i == j)
                    result += mat[i][j];
                System.out.print(mat[i][j] + "|");
            } 
            System.out.println("");
        }
        System.out.println(result);
        result = 0;
        /**********************************************************************/
        System.out.println("(d) Calcule a soma da diagonal secundaria da matriz: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(i == 0 && j == 4 || i == 1 && j == 3 || i == 2 && j == 2
                        || i == 3 && j == 1 ||i == 4 && j == 0 )
                        result += mat[i][j];
                System.out.print(mat[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println(result);
        result = 0;
        /**********************************************************************/
        System.out.println("(e) Calcule a soma de todos os elementos da matriz: ");
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                result += mat1[j];
                System.out.print(mat1[j] + "|");
            }
            System.out.println("");
        }
        System.out.println(result);
        result = 0;
        /**********************************************************************/
        System.out.println("(f) Elementos da matriz: ");
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat1[j] + "|");
            }
            System.out.println("");
        }
    }   
}
