package Exercicio_III;

public class Diarista extends Funcionario{
    private double salarioDia;
    private int diasTrabalhados;
    
    @Override
    public Double calcularSalario() {
        return this.getSalarioDia() * this.getDiasTrabalhados();
    }

    public Diarista() {
        this.salarioDia = 0.0;
        this.diasTrabalhados = 0;
    }
    public Diarista(double salarioDia, int diasTrabalhados) {
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public double getSalarioDia() {
        return salarioDia;
    }
    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    } 
}
