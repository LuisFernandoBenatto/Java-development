package CorrecaoExercicios.Exercicio_III;

public class Diarista extends Funcionario{
    private Double salarioDia;
    private Integer diasTrabalhados;
    
    @Override
    public Double calcularSalario() {
        return this.getSalarioDia() * this.getDiasTrabalhados();
    }
    public Diarista() {
        this.salarioDia = 0.0;
        this.diasTrabalhados = 0;
    }
    public Diarista(Double salarioDia, Integer diasTrabalhados) {
        this.salarioDia = salarioDia;
        this.diasTrabalhados = diasTrabalhados;
    }
    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public Double getSalarioDia() {
        return salarioDia;
    }
    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    public void setSalarioDia(Double salarioDia) {
        this.salarioDia = salarioDia;
    } 
    @Override
    public String toString() {
        return "Diarista - trabalha " + this.getDiasTrabalhados() 
                + " dias ao mês." + " - " + "Recebe " + this.getSalarioDia() + 
                " por dia.";           
    }
}