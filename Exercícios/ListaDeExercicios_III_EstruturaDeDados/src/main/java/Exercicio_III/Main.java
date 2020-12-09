package Exercicio_III;

public class Main {
    public static void main(String[] args) {
        SomatorioDeValoresDoVetor somatorio = new SomatorioDeValoresDoVetor();
               
        int tamanho = 100;
        int[] vet = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vet[i] = (i+10);
            System.out.println("Posição: " + i + " - " + vet[i]);  
        }
        System.out.println("Resultado: " +
                            somatorio.soma(vet, tamanho, tamanho - 1));
   }   
}