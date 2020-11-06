package bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 
        int inteiro[] = new int[10];
        int temp;
        for (int i = 0; i < inteiro.length; i++) {
            inteiro[i] = i + 7;
        }
        inteiro[2] += 30;
        inteiro[4] += 99;
        int tamanho = inteiro.length;
        for (int out = (tamanho-1); out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (inteiro[in] > inteiro[in+1]) {
                    temp = inteiro[in+1];
                    inteiro[in+1] = inteiro[in];
                    inteiro[in+1] = temp;
                    //inteiro = swap(in, (in+1), inteiro);
                }
            } 
        }
        System.out.println("Inteiro: " + Arrays.toString(inteiro));
    } 
}
