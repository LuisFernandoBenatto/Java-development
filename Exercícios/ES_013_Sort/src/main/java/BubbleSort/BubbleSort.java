package bubblesort;

public class BubbleSort {
    public int[] bubblesort(int arr[]) {
        System.out.println("....Bubble Sort....");
        int tamanho = arr.length;
        for (int out = (tamanho-1); out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (arr[in] > arr[in+1]) {
                    arr = swap(in, (in+1), arr);
                }
            }
        }
        return arr;
    }  

    private int[] swap(int in, int i, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[in];
        arr[i] = temp;
        
        return arr;
    }
}
