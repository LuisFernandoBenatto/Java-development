package Exercicio_14;
/*
    • Então crie uma estrutura de dados de um produto. A estrutura deverá conter
    às seguintes informações: nomeProduto(String), valor(Double), quantidade
    (int).
*/
public class Produto {
    private String nomeProduto;
    private Double valor;
    private int quantidade;
    
    public Produto() {
        this.nomeProduto = "";
        this.valor = 0.0;
        this.quantidade = 0;
    }
    
    public Produto(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade ;
    }
    
    public String getNomeProduto() {
        return this.nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Double getValor() {
        return this.valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
