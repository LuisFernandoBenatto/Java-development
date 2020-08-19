/*
Crie uma classe Caixa com os atributos largura, altura e comprimento. 
Crie o método calcularVolume( ), que retorna o volume da caixa 
(lagura x altura x comprimento).

A classe deve ter um construtor “vazio”, que inicia os atributos com 0 (zero). 
Deve ter um segundo construtor, que recebe os três atributos como parâmetros. 
Deve ter um terceiro construtor, que recebe um único parâmetro. Neste caso, 
inicie os três atributos com o parâmetro recebido.

Crie uma classe chamada Main para instanciar objetos. Instancie um objeto
chamando o primeiro construtor, um chamando o segundo e outro chamando o
terceiro construtor.
 */
package com.mycompany.boxproject;

public class Main {
    public static void main(String[] args) {
        
    Box Box_1 = new Box();
    System.out.println(Box_1.calcularVolume());
    
    Box  Box_2 = new Box(12.5, 14.7, 80.6);
    System.out.println(Box_2.calcularVolume());

    Box Box_3 = new Box(22.9);
    System.out.println(Box_3.calcularVolume());
    }
}
