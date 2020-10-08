package exercicio_2;

public class Main {
    public static void main(String[] args) {
        int vet_1[] = {
            12, 10, 15, 17, 42,
            24, 20, 30, 14, 84,
            48, 40, 60, 28, 25,
            37, 21, 13, 45, 50
        };
        int vet_2[]= {
            56, 27, 18, 25, 79, 
            99, 72, 32, 50, 14,
            96, 11, 11, 24, 57,
            65, 79, 35, 02, 10
        };  
        
        mostrarVetor(vet_1);
        mostrarVetor(vet_2);
        
        int[] vetorResultado = new int[20];
        
        somandoVetores(vet_1, vet_2, vetorResultado);
        mostrarVetor(vetorResultado);
    }
    public static void mostrarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " | ");     
        }
        System.out.println("");
    }
    public static int[] somandoVetores(int[] vetor_1, int[] vetor_2,
            int[] vetorFinal ) {
        for (int i = 0; i < vetor_1.length && i < vetor_2.length; i++) {
            vetorFinal[i]  = vetor_1[i] + vetor_2[i];
        }
        return vetorFinal;
    }
    
}
