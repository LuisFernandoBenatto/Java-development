package Exercicio_III;

public class No {
    
    private int chave;
    private String valor;
    
    No proximo;
    No anterior;

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
