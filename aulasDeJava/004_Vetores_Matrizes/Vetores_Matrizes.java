package vetores_matrizes;


public class Vetores_Matrizes {

    public static void main(String[] args) {
        
        int vetInt[] = new int [10];
        for(int i = 0; i < vetInt.length; i++){
            vetInt[i] = i+10;
            System.out.print(vetInt[i] + "|");
        }
        System.out.println();
        System.out.println();
        int mat[][] = new int[4][4];
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = i * j;      
                    System.out.print(mat[i][j] + "|");
                
            }
            System.out.println();
        }       
    }
    
}
