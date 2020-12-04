package recursividade_II;

public class Main {
    public static void main(String[] args) {
        int value = 10;
        System.out.println("Fibonacci: " + fibonacci(value));
        
    }  
    public static int fibonacci(int value) {
        if(value <= 2) {
            return 1;
        } else {
            return fibonacci(value - 1) + fibonacci(value - 2);
        }
    }
}
