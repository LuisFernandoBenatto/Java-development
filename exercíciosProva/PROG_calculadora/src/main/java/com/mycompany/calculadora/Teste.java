package com.mycompany.calculadora;
/**
 * @author luis fernando meneghel benatto
 */
public class Teste {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();  
        int resultado = calculadora.somar(50, 20, 30);
        
        System.out.println(resultado);
        System.out.println(calculadora.somar(50, 100, 30));
    }
}
