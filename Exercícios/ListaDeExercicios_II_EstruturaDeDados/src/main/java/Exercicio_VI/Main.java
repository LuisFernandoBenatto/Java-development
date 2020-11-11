/*
        6) Tendo como base um vetor de Objetos chamado vetObj, cuja chave é o 
    atributo do tipo inteiro de nome “chave”, crie algoritmos de ordenação 
    utilizando os métodos buble Sort, selection Sort e Insertion Sort;
 */
package Exercicio_VI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        No[] vetObj = new No[4];
        
        vetObj[0] = new No(25, "vinte e cinco");
        vetObj[1] = new No(42, "quarenta e dois");
        vetObj[2] = new No(7, "sete");
        vetObj[3] = new No(13, "treze");
        
        Ordenacao ordenacao = new Ordenacao(vetObj);
        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i].getChave() + " - " 
            + vetObj[i].getValor());
        }
        
        No[] vetBubbleSort = ordenacao.bubbleSort();
        for (int i = 0;i < vetBubbleSort.length; i++) {
            System.out.println(vetBubbleSort[i].getChave() + " - " +
                    vetBubbleSort[i].getValor());
        }
        System.out.println("");
        
        System.out.println("Insertion Sort");
        vetObj = new No[4];
        
        vetObj[0] = new No(20, "vinte");
        vetObj[1] = new No(38, "trinta e oito");
        vetObj[2] = new No(100, "cem");
        vetObj[3] = new No(11, "onze");
        
        ordenacao = new Ordenacao(vetObj);
        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i].getChave() + " - " 
            + vetObj[i].getValor());
        }
        
        No[] vetInsertionSort = ordenacao.insertionSort();
        for (int i = 0;i < vetInsertionSort.length; i++) {
            System.out.println(vetInsertionSort[i].getChave() + " - " +
                    vetInsertionSort[i].getValor());
        }
        
        System.out.println("");
        
                System.out.println("Insertion Sort");
        vetObj = new No[4];
        
        vetObj[0] = new No(51, "cinquenta e um");
        vetObj[1] = new No(39, "trinta e nove");
        vetObj[2] = new No(88, "oitenta e oito");
        vetObj[3] = new No(73, "setenta e tres");
        
        ordenacao = new Ordenacao(vetObj);
        for (int i = 0; i < vetObj.length; i++) {
            System.out.println(vetObj[i].getChave() + " - " 
            + vetObj[i].getValor());
        }
        
        No[] vetSelectionSort = ordenacao.selectionSort());
        for (int i = 0;i < vetSelectionSort.length; i++) {
            System.out.println(vetSelectionSort[i].getChave() + " - " +
                    vetSelectionSort[i].getValor());
        }
    }
}
