package Exercicio_VI;

public class No {
    
    private int chave;
    private String valor;

    public No() {
        this.chave = 0;
        this.valor = "";
    }
    public No(int chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }
    public int getChave() {
        return chave;
    }
    public String getValor() {
        return valor;
    }
    public void setChave(int chave) {
        this.chave = chave;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
}
