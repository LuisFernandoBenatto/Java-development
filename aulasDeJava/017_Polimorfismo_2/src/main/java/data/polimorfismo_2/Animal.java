package data.polimorfismo_2;

public abstract class  Animal {
    protected Double Peso;
    protected Integer Idade;
    protected Integer Membros;
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public Animal() {
        this.Peso = 0.0;
        this.Idade = 0;
        this.Membros = 0;
    }
    public Animal(Double Peso, Integer Idade, Integer Membros) {
        this.Peso = Peso;
        this.Idade = Idade;
        this.Membros = Membros;
    }

    public Double getPeso() {
        return Peso;
    }
    public Integer getIdade() {
        return Idade;
    }
    public Integer getMembros() {
        return Membros;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }
    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }
    public void setMembros(Integer Membros) {
        this.Membros = Membros;
    }
  
}
