package InsertionSort;

public class Insertionsort {
    public int[] insertionSort(int arr[]) {
        System.out.println("....Insertion Sort....");
        
        for (int out = 1; out < arr.length; out++) {
            for (int in = out; in > 0; in--) {
                if (arr[in] < arr[in-1]) {
                    arr = swap(in, (in - 1), arr);
                } else {
                    break;
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
