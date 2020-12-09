package data.algoritmosdebusca;

public class Main {
    public static void main(String[] args) {
        BuscaBin busca = new BuscaBin();
        int vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int posicao = busca.buscaBinaria(10, vet, 0,(vet.length - 1));
        System.out.println("Posição: " + posicao);
        
        posicao = busca.buscaBinaria(7, vet, 0,(vet.length - 1));
        System.out.println("Posição: " + posicao);
        
        posicao = busca.buscaBinaria(1, vet, 0,(vet.length - 1));
        System.out.println("Posição: " + posicao);
        posicao = busca.buscaBinaria(14, vet, 0,(vet.length - 1));
        System.out.println("Posição: " + posicao);
    } 
}
