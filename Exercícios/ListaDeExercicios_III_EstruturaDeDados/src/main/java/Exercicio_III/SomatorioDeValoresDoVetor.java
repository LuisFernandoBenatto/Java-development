package Exercicio_III;

public class SomatorioDeValoresDoVetor {
    public int soma(int vet[], int vetTamanho, int indice) {
        if(vetTamanho == 0) {
            return vet[0];
        } else {
            if(vet[indice]%2 == 0) {
                return vet[indice] + soma(vet, vetTamanho - 1, indice - 1);
            } else {
                return soma(vet, vetTamanho - 1, indice - 1);
            }
        }
    }   
}