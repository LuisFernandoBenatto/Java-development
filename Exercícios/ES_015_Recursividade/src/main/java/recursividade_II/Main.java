package recursividade_II;

/*
 * 1, 1, 2, 3, 5, 8, 13, 21, ...
 * 1  2  3  4  5  6   7   8  ...
 */

import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        int value = 45;
        System.out.println("Fibonacci: " + fibonacci(value));
        
        System.out.println("Fibonacci_dinamico: " + fibonacci_dinamico(45));
        
    }  
    public static int fibonacci(int value) {
        if(value <= 2) {
            return 1;
        } else {
            return fibonacci(value - 1) + fibonacci(value - 2);
        }
    }
    
    static int fibonacci_vet[] = new int[100];
    
    public static int fibonacci_dinamico(int value) {
        if(fibonacci_vet[value] != 0) {
            return fibonacci_vet[value];
        } else {
            if(value <= 2) {
                return 1;
            } else {
                fibonacci_vet[value] = fibonacci_dinamico(value - 1) +
                                       fibonacci_dinamico(value - 2);
            }
            return fibonacci_vet[value];
        }
    }
}
