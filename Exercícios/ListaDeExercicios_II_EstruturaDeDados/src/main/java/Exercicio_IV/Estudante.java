package Exercicio_IV;

public class Estudante {
    public String nome;
    private String matricula;
    private Double rendimento;
    private String nomeDoCurso;

    public Estudante() {
        this.nome = "";
        this.matricula = "";
        this.rendimento = 0.0;
        this.nomeDoCurso = "";
    }
    public Estudante(String nome, String matricula, Double rendimento, String nomeDoCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.rendimento = rendimento;
        this.nomeDoCurso = nomeDoCurso;
    }
    @Override
    public String toString() {
        return (
            "Nome: " + this.getNome() + " - " +
            "Numero da matricula: " + this.getMatricula() + " - " + 
            "Coeficiente de Rendimento (Nota): " + this.getRendimento()
            + " - " + "Nome do Curso: " + this.getNomeDoCurso());
    }  
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public Double getRendimento() {
        return rendimento;
    }
    public String getNomeDoCurso() {
        return nomeDoCurso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }
    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }
}
