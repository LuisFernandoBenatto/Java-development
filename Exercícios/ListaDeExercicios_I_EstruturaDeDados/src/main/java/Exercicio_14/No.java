package Exercicio_14;

public class No {
    Produto produto;
    int id;
    
    public No() {
        this.id = 0;
        this.produto = null;
    }
    
    public No(Produto produto, int _id) {
        this.produto = produto;
        this.id = _id;
    }
    
    @Override
    public String toString() {
        return "Nome do produto: " + produto.getNomeProduto() + " - " +
               "Valor do produto: " + produto.getValor() + " - " +
               "Quantidade: " + produto.getQuantidade();
    }
    
    public Produto getProduto() {
        return this.produto;
    }
    public void setNome(Produto produto) {
        this.produto = produto;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
