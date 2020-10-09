/*
    2 • Com base nas classes do exercício 1, crie uma classe que tenha o método 
    main( ).Instancie um objeto da classe Circulo. Mostre como acessar os 
    atributos x, y e raio deste objeto.
*/
package Exercicio_2;

import Exercicio_1.*;

public class Main {
    public static void main(String[] args) {
        Ponto ponto = new Ponto(12.57, 65.43); 
        Circulo circulo = new Circulo(ponto, 2.0);
        
        System.out.println(circulo.toString());
        
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Ponto X: " + ponto.getPontoX());
        System.out.println("Ponto Y: " + ponto.getPontoY());
        System.out.println("");
        
        circulo.setRaio(11.92);
        ponto.setPontoX(15.86);
        ponto.setPontoY(-2.43);
        
        System.out.println(circulo.toString());
        
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Ponto X: " + ponto.getPontoX());
        System.out.println("Ponto Y: " + ponto.getPontoY());
        System.out.println("");
        
        Pixel pixel = new Pixel("Verde-Claro", 75.22, 68.34);
        System.out.println(pixel.toString());
    }
    
}
