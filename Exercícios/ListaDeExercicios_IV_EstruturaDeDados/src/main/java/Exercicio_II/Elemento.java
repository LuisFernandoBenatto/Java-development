package Exercicio_II;

public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> esquerda;
    private Elemento<TIPO> direita;

    public Elemento(TIPO novoValor) {
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }
    public Elemento(TIPO valor, Elemento<TIPO> esquerda,
                                                       Elemento<TIPO> direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }
    public TIPO getValor() {
        return valor;
    }
    public void setValor(TIPO valor) {
        this.valor = valor;
    }
    public Elemento<TIPO> getDireita() {
        return direita;
    }
    public void setDireita(Elemento<TIPO> direita) {
        this.direita = direita;
    }
    public Elemento<TIPO> getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(Elemento<TIPO> esquerda) {
        this.esquerda = esquerda;
    } 
}
