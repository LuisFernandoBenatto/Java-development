package Exercicio_4;

public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(15.5, 4.6);
        Triangulo triangulo = new Triangulo(2.72, 8.17);
        
        System.out.println(retangulo.toString());
        System.out.println("Área do retangulo: " + retangulo.calcularArea());
        System.out.println("");
        
        System.out.println(triangulo.toString());
        System.out.println("Área do triangulo: " + triangulo.calcularArea());
        System.out.println("");
        
        
    }
    
}
