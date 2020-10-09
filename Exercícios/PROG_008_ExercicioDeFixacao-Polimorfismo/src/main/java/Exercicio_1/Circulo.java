package Exercicio_1;

public class Circulo {
    private Ponto pontoCentro;
    private double raio;

    public Circulo() {
        this.raio = 0.0;
        this.pontoCentro = new Ponto(0.0, 0.0);
    }

    public Circulo(Ponto pontoCentro, double raio) {
        this.pontoCentro = pontoCentro;
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Raio do Circulo: " + this.getRaio() + " || " +
               "Ponto X: " + this.pontoCentro.getPontoX() + " || " +
               "Ponto Y: " + this.pontoCentro.getPontoY();
    }
    
    
}
