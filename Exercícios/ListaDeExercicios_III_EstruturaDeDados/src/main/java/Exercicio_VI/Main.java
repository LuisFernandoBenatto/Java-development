package Exercicio_VI;

public class Main {
    public static void main(String[] args) {
        QuickSort quick = new QuickSort();
        int[] array = {5, 8, 1, 2, 7, 3, 6, 9, 4, 10};
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " # ");
	}
        System.out.println("");
        quick.quickSort(array, 0, 10);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " # ");
        }
   }   
}