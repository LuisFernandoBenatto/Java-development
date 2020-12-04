package data.recursividade;

public class Main {
    public static void main(String[] args) {
        int value = 280;
        System.out.println("Value: " + value);
        System.out.println("Value: " + metodoRecursivo(value));
        
        value = 6;
        System.out.println("Resultado recursivo Triangular");
        System.out.println("Value: " + value);
        System.out.println("Value: " + triangular(value));
        
        System.out.println("Resultado Triangular com For");
        System.out.println("value: " + triangular_for(value));
    }
    public static int metodoRecursivo(int value) {
        if(value > 300) {
            return 1;
        } else if(value == 300) {
            return value;
        } else {
            System.out.println(value);
            return metodoRecursivo(value + 1);
        }
    }
    public static int triangular(int value) {
        if(value == 1) {
            return 1;
        } else {
            return triangular(value - 1) + value;
        }
    }
    public static int triangular_for(int value) {
       int triangular = 0;
        for (int i = 1; i <= value; i++) {
            triangular = triangular + i;
        }
        return triangular;
    } 
}
