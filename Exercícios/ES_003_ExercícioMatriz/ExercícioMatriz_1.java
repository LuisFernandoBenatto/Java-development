/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercíciomatriz_1;
import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class ExercícioMatriz_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        
        int mat[][] = new int[3][3];
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = scanf.nextInt();
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "|");
            }
            System.out.println();
        }
    } 
}
