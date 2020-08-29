/*
1. Crie uma classe Caixa com os atributos largura, altura e comprimento. Crie o
método calcularVolume( ), que retorna o volume da caixa (lagura x altura x
comprimento).
A classe deve ter um construtor “vazio”, que inicia os atributos com 0 (zero). Deve ter
um segundo construtor, que recebe os três atributos como parâmetros. Deve ter um
terceiro construtor, que recebe um único parâmetro. Neste caso, inicie os três
atributos com o parâmetro recebido.

Crie uma classe chamada Main para instanciar objetos. Instancie um objeto
chamando o primeiro construtor, um chamando o segundo e outro chamando o
terceiro construtor.
*/
package construtores;
public class Construtores {

    public static void main(String[] args) {
        
        Caixa caixa = new Caixa();
        Caixa caixa2 = new Caixa(23.3f, 25.8f, 21.7f);
        Caixa caixa3 = new Caixa(25.0f);
        
        System.out.println("Caixa 1 (primeiro construtor)");
        System.out.println("O volume da caixa é: " + caixa.CalcularVolume()); 
        System.out.println("Caixa 2 (segundo construtor)");
        System.out.println("O volume da caixa é: " + caixa2.CalcularVolume());
        System.out.println("Caixa 3 (terceiro construtor)");
        System.out.println("O volume da caixa é: " + caixa3.CalcularVolume());
    }    
}
