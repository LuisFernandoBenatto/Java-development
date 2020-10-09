package Exercicio_4;

public class Retangulo extends Figura {
    private double TotalArea;

    public Retangulo() {
        this.TotalArea = 0.0;
        this.setDimensao_1(0.0);
        this.setDimensao_2(0.0);
    }

    public Retangulo(double Dimensao_1, double Dimensao_2) {
        super(Dimensao_1, Dimensao_2);
        this.TotalArea = 0.0;
    }

    @Override
    public double calcularArea() {
        this.TotalArea = super.getDimensao_1() * super.getDimensao_2();
        return TotalArea;
    }  

    public double getTotalArea() {
        return TotalArea;
    }

    public void setTotalArea(double TotalArea) {
        this.TotalArea = TotalArea;
    }
    
    @Override
    public String toString() {
        return "Dimensão 1: " + this.getDimensao_1() + " || " +
               "Dimensão 2: " + this.getDimensao_2();
    }
}
