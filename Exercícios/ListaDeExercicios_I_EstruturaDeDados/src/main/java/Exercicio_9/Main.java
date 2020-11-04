package Exercicio_9;

public class Main {
    public static void main(String[] args) {
        int vetor[] = new int[9];
        int ponteiro = -1;
    
        ponteiro = inserir(vetor, 2, ponteiro);
        ponteiro = inserir(vetor, 3, ponteiro);
        ponteiro = inserir(vetor, 6, ponteiro);
        ponteiro = inserir(vetor, 7, ponteiro);
        ponteiro = inserir(vetor, 8, ponteiro);
    
        for (int i = 0; i <= ponteiro; i++) {
            System.out.print("(" + i + "): "+ vetor[i] + " ");   
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
        ponteiro = inserir(vetor, 1, ponteiro);
        ponteiro = inserir(vetor, 15, ponteiro);
        
        for (int i = 0; i <= ponteiro; i++) {
            System.out.print("(" + i + "): "+ vetor[i] + " ");     
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
        ponteiro = remover(vetor, 3, ponteiro);
        
        for (int i = 0; i <= ponteiro; i++) {
            System.out.print("(" + i + "): "+ vetor[i] + " ");    
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
        ponteiro = inserir(vetor, 4, ponteiro);
        
        for (int i = 0; i <= ponteiro; i++) {
            System.out.print("(" + i + "): "+ vetor[i] + " ");   
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
        ponteiro = remover(vetor, 7, ponteiro);
        
        for (int i = 0; i <= ponteiro; i++) {
            System.out.print("(" + i + "): "+ vetor[i] + " ");    
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
        ponteiro = limpaLista(vetor);
        
        for (int i = 0; i <= ponteiro; i++) {
            System.out.print("(" + i + "): "+ vetor[i] + " ");   ;   
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
        ponteiro = inserir(vetor, 10, ponteiro);
        ponteiro = inserir(vetor, 9, ponteiro);
        ponteiro = inserir(vetor, 5, ponteiro);
        ponteiro = inserir(vetor, 7, ponteiro);
    
        for (int i = 0; i <= ponteiro; i++) {
            System.out.print("(" + i + "): "+ vetor[i] + " ");      
        }
        System.out.println("\n");
        //----------------------------------------------------------------------
    }
    //--------------------------------------------------------------------------
    public static int inserir(int vetor[], int dados, int ponteiro) {
        if(ponteiro >= (vetor.length) - 1) {
            System.out.println("Ponteiro maior que o vetor!");
        } else {
            ponteiro++;
            vetor[ponteiro] = dados;
            System.out.println("Inserido com sucesso!!!");
        }
        return ponteiro;
    }
    //--------------------------------------------------------------------------
    public static int remover(int vetor[], int dados, int ponteiro) {
        int index = obterValor(vetor, dados, ponteiro);
        if(index == - 1) {
            System.out.println("Valor não existe!");
            return ponteiro;
        }
        for (int i = index; i <= ponteiro; i++) {
            if(i < (vetor.length) - 1) {
                vetor[i] = vetor[i + 1];
            }
        }
        System.out.println("Removido com Sucesso!!!");
        return ponteiro - 1;
    }
    //--------------------------------------------------------------------------
    private static int obterValor(int vetor[], int dados, int ponteiro) {
        if(ponteiro >= (vetor.length) - 1){
            System.out.println("Ponteiro maior que o vetor!");
            return ponteiro;
        }
        for (int i = 0; i <= ponteiro; i++) {
            if(vetor[i] == dados){
                return i;
            }
        }
        return -1;
    }
    //--------------------------------------------------------------------------
    private static int limpaLista(int vetor[]) {
        vetor = new int[9];
        System.out.println("Limpando a lista....");
        return -1;
    }
    //--------------------------------------------------------------------------
}