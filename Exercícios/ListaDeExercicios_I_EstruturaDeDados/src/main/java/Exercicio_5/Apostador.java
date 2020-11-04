package Exercicio_5;

public class Apostador {
    private String _nome;
    private int _aposta[] = new int[13];
    
    Apostador() {
        this._nome = "";
        this._aposta = null;
    }   
    Apostador(String nome, int aposta[]) {
        this._nome = nome;
        this._aposta = aposta;
    }
    
    public String getNome() {
        return this._nome;
    }
    public void setNome(String nome) {
        this._nome = nome;
    }
    public int[] getAposta() {
        return this._aposta;
    }
    public void setAposta(int aposta[]) {
        this._aposta = aposta;
    }
}
