package Exercicio_III;

public class Gerente extends Funcionario{
    private double salarioMes;

    @Override
    public Double calcularSalario() {
        return this.getSalarioMes() + ((this.getSalarioMes() * 10) / 100);
    }

    public Gerente() {
        this.salarioMes = 0.0;
    }
    public Gerente(double salarioMes) {
        this.salarioMes = salarioMes;
    }
    public double getSalarioMes() {
        return salarioMes;
    }
    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }  
}
