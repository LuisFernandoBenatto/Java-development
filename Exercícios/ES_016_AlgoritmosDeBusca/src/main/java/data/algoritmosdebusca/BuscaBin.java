package data.algoritmosdebusca;

public class BuscaBin {
    public int buscaBinaria(int dado, int vet[], int inicio, int fim) {
        int posicaoCorrente;
        posicaoCorrente = (int)(inicio + fim) / 2;
        
        if(vet[posicaoCorrente] == dado) {
            return posicaoCorrente;
        } else if(inicio > fim) {
            return -1; // Não enecontrou nenhum elemento
        } else {
            if(vet[posicaoCorrente] < dado) {
                // esta na porção direita do vetor vet
                return buscaBinaria(dado, vet, posicaoCorrente + 1, fim);               
            } else {
                // esta na posição a esquerda do vetor vet
                return buscaBinaria(dado, vet, inicio, posicaoCorrente - 1);
            }
        }
    }
}