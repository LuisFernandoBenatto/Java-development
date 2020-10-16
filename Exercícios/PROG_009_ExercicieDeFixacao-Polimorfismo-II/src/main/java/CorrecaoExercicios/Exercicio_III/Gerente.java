package CorrecaoExercicios.Exercicio_III;

public class Gerente extends Funcionario{
    private Double salarioMes;

    @Override
    public Double calcularSalario() {
        return this.getSalarioMes() + ((this.getSalarioMes() * 10) / 100);
    }
    public Gerente() {
        this.salarioMes = 0.0;
    }
    public Gerente(Double salarioMes) {
        this.salarioMes = salarioMes;
    }
    public Double getSalarioMes() {
        return salarioMes;
    }
    public void setSalarioMes(Double salarioMes) {
        this.salarioMes = salarioMes;
    }  

    @Override
    public String toString() {
        return "Gerente recebe: " + this.getSalarioMes() + " por mês." + " - "
                + "Com mais um adicional de 10%, ele recebe " 
        + this.calcularSalario() + " por mês";
    }
}