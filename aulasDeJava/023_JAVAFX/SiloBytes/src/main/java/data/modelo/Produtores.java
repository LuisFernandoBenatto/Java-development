package data.modelo;

import java.io.Serializable;

public class Produtores implements Serializable{
   private String nomeProdutor;
   private String produto;
   private String dataDeEntrada;
   private String quantidadeDeProduto;

    public Produtores() {
        this.nomeProdutor = "";
        this.produto = "";
        this.dataDeEntrada = "";
        this.quantidadeDeProduto = "";
    }
    public Produtores(String nomeProdutor, String produto, String dataDeEntrada, String quantidadeDeProduto) {
        this.nomeProdutor = nomeProdutor;
        this.produto = produto;
        this.dataDeEntrada = dataDeEntrada;
        this.quantidadeDeProduto = quantidadeDeProduto;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public String getNomeProdutor() {
        return nomeProdutor;
    }

    public String getProduto() {
        return produto;
    }

    public String getQuantidadeDeProduto() {
        return quantidadeDeProduto;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public void setNomeProdutor(String nomeProdutor) {
        this.nomeProdutor = nomeProdutor;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidadeDeProduto(String quantidadeDeProduto) {
        this.quantidadeDeProduto = quantidadeDeProduto;
    }
    
   
   
}
