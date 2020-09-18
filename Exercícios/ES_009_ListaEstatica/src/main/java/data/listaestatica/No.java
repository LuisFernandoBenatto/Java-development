package data.listaestatica;

public class No { // Classe Nó
    String nome;
    //--------------------------------------------------------------------------
    public No(String n) {
        this.nome = n;
    }
    //--------------------------------------------------------------------------
    public String toString() {
        return "Nome : " + this.nome;
    }
    //--------------------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }
    //--------------------------------------------------------------------------
    public String getNome() {
        return this.nome;
    }
    //--------------------------------------------------------------------------
}
