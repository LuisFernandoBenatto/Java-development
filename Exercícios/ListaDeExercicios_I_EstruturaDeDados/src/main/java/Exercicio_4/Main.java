package Exercicio_4;

public class Main {
    public static void main(String[] args) {
        String vetor[] = {
            "primeiro", "segundo", "terceiro", "quarto", "quinto",
            "sexto", "sétimo", "oitavo", "nono", "décimo",
            "décimo primeiro", "décimo segundo", "décimo terceiro",
            "décimo quarto", "décimo quinto",
            "décimo sexto", "décimo sétimo",
            "décimo oitavo", "décimo nono", "vigésimo"
        };
        System.out.println("****** Mostarndo vetor antes da inversão ******");
        mostrarVetor(vetor);
        inverterArray(vetor);
        System.out.println("**********************************************");
        System.out.println("***** Mostarndo vetor depois da inversão *****");
        mostrarVetor(vetor);
    }
    private static void inverterArray(String vetor[]) {
        int inicio = 0;
        int fim = vetor.length - 1;
        
        for (int i = inicio; i < fim; ) {
            trocarPosicao(vetor, i, fim);
            i++; 
            fim--;
        }
    }
    private static void trocarPosicao(String string[], int i, int fim) {
        String aux = string[i];
        string[i] = string[fim];
        string[fim] = aux;
    }

    private static void mostrarVetor(String[] vetor) {
        for (String x : vetor) {
            System.out.println(x + "");
        }
    }
}
