/*
 *Construa um algoritmo que realiza a soma 
 * entre duas matrizes e imprima a matriz resultante
*/
package exercicio_2;


public class Exercicio_2 {

    public static void main(String[] args) {
        int mat[][] = {
                       {0, 1, 2, 3},
                       {4, 5, 6, 7},
                       {8, 9, 10, 11},
                       {12, 13, 14, 15}
                      };
        int mat_2[][] = {
                       {0, 1, 2, 3},
                       {4, 5, 6, 7},
                       {8, 9, 10, 11},
                       {12, 13, 14, 15}
                      };
        int mat_3[][] = new int[4][4];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat_3[i][j] = mat[i][j] + mat_2[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat_3[i][j] + "|");
            }
            System.out.println();
        }
    }   
}
