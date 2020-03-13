/*
 * Construa um algoritmo que realiza a soma dos 
 * elementos da matriz e a apresenete o resultado;
 */
package exercicio_1;

public class Exercicio_1 {

    public static void main(String[] args) {
        
        int mat[][] = {
                       {0, 1, 2, 3},
                       {4, 5, 6, 7},
                       {8, 9, 10, 11},
                       {12, 13, 14, 15}
                      };
        int resultado = 120;
        int result = 0;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                result += mat[i][j];
                System.out.print(mat[i][j] + "|");               
            } 
            System.out.println();
        }
        System.out.println(result);         
    }
}
    
