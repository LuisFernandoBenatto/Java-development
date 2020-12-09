package Exercicio_I;

public class SomaDosPrimeirosInteiros {
    public int primeirosInteiros(int vet[], int tamanho) {
        if(tamanho == 0) {
            return vet[0];
        } else {
            return vet[tamanho - 1] + primeirosInteiros(vet, tamanho - 1);
        }
    }   
}