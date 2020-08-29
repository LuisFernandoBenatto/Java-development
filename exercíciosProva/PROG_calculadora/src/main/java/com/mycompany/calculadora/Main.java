package com.mycompany.calculadora;
public class Main {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();  
        int resultado = calculadora.somar(50, 20, 30);
        
        System.out.println("Resultado: " + resultado);
        System.out.println("Resultado: " + calculadora.somar(50, 100, 30));
    }
}
