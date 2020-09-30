package Exercicio_12;

public class No {
    String nome;
    int id;
    
    public No() {
        this.nome = "";
        this.id = 0;
    }
    
    public No(String _nome, int _id) {
        this.nome = _nome;
        this.id = _id;
    }
    
    public String toString() {
        return "Nome: " + nome + " - " 
                + "Id: " + id;
    } 
}
