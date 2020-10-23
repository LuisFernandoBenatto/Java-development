package capitulo_8;

public abstract class Pessoa {
    private String nome;
    
    public Pessoa() {
        nome = "";
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public abstract Integer getIdade();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
