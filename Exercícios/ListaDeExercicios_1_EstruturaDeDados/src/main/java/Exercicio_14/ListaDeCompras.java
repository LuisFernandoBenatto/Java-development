package Exercicio_14;
/*
    • Então crie uma nova classe chamada ListaCompras que herde os atributos e 
    métodos da classe que implementa às listas genéricas, e na ListaCompras 
    implemente o método de calculoTotal que deverá calcular o valor total em 
    produtos armazenados na listaCompras e imprimir o valor na tela.
 */
public class ListaDeCompras extends Produtos {
    private double calcularTotal;
    
    public ListaDeCompras(){
        this.setNomeProduto("");
        this.setValor(0.0);
        this.setQuantidade(0);
        this.calcularTotal = 0.0;
    }
    public ListaDeCompras(String nomeProduto, double valor, 
                          int quantidade, double calcularTotal){
        super(nomeProduto, valor, quantidade);
        this.calcularTotal = calcularTotal;
    }
    public Double getCalcularTotal() {
        return this.calcularTotal;
    }
    public void setCalcularTotal(double calcularTotal) {
        this.calcularTotal = calcularTotal;
    }
}
