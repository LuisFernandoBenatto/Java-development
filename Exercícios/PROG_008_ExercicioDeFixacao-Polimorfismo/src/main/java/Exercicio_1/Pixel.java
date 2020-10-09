package Exercicio_1;

public class Pixel extends Ponto {
    private String cor;

    public Pixel() {
        this.cor = "";
        this.setPontoX(0.0);
        this.setPontoY(0.0);
    }

    public Pixel(String cor, double pontoX, double pontoY) {
        super(pontoX, pontoY);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Cor do Pixel: " + this.getCor() + " || " +
               "Ponto X: " + super.getPontoX() + " || " +
               "Ponto Y: " + super.getPontoY();
    }
}
