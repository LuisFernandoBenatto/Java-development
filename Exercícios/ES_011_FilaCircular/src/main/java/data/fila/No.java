package data.fila;

public class No {
    String nome;
    int id;
    
    public No() {
        this.id = 0;
        this.nome = "";
    }
    
    public No(String _nome, int _id) {
        this.nome = _nome;
        this.id = _id;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + " - " 
                + "Id: " + id;
    }  
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
