/**
 * 1 Escreva a classe Ponto com os atributos x e y (coordenadas no plano 
 * cartesiano).Escreva a classe Pixel que é um Ponto que tem o atributo cor. 
 * Escreva a classe Circulo que tem um ponto como seu centro e o atributo raio. 
 * Com isto, mostre a diferença entre o relacionamento é um e o relacionamento 
 * tem um.
 */
package Exercicio_1;

public class Ponto {
    private double pontoX;
    private double pontoY;

    public Ponto() {
        this.pontoX = 0.0;
        this.pontoY = 0.0;
    }

    public Ponto(double pontoX, double pontoY) {
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    public double getPontoX() {
        return pontoX;
    }

    public double getPontoY() {
        return pontoY;
    }

    public void setPontoX(double pontoX) {
        this.pontoX = pontoX;
    }

    public void setPontoY(double pontoY) {
        this.pontoY = pontoY;
    }  
}
