package data.provadeestruturadedados;

public class Produtos {
    private int CodigoDoProduto;
    private String NomeDoProduto;
    private float PrecoDeCompra;
    private float PrecoDeVenda;

    public Produtos() {
        this.CodigoDoProduto = -1;
        this.NomeDoProduto = " ";
        this.PrecoDeCompra = 0;
        this.PrecoDeVenda = 0;
    }
    public Produtos(int CodigoDoProduto, String NomeDoProduto,
                                      float PrecoDeCompra, float PrecoDeVenda) {
        this.CodigoDoProduto = CodigoDoProduto;
        this.NomeDoProduto = NomeDoProduto;
        this.PrecoDeCompra = PrecoDeCompra;
        this.PrecoDeVenda = PrecoDeVenda;
    }

    public int getCodigoDoProduto() {
        return CodigoDoProduto;
    }

    public String getNomeDoProduto() {
        return NomeDoProduto;
    }

    public float getPrecoDeCompra() {
        return PrecoDeCompra;
    }

    public float getPrecoDeVenda() {
        return PrecoDeVenda;
    }

    public void setCodigoDoProduto(int CodigoDoProduto) {
        this.CodigoDoProduto = CodigoDoProduto;
    }

    public void setNomeDoProduto(String NomeDoProduto) {
        this.NomeDoProduto = NomeDoProduto;
    }

    public void setPrecoDeCompra(float PrecoDeCompra) {
        this.PrecoDeCompra = PrecoDeCompra;
    }

    public void setPrecoDeVenda(float PrecoDeVenda) {
        this.PrecoDeVenda = PrecoDeVenda;
    }
    
    @Override
    public String toString() {
        return "Codigo do Produto" + this.getCodigoDoProduto()+ "- " +
               "Nome do produto: " + this.getNomeDoProduto() + " - " +
               "Preço de Compra: " + this.getPrecoDeCompra() + " - " +
               "Preço de Venda: " + this.getPrecoDeVenda();
    }
}
