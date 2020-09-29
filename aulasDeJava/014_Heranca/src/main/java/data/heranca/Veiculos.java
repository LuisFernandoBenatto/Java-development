package data.heranca;

public class Veiculos {
    private String marca;
    private Integer ano;
    private Double valor;
    
    public Veiculos() {
        this.marca = "";
        this.ano = 0;
        this.valor = 0.0;
    }
    
    public Veiculos(String marca, Integer ano, Double valor) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }
    
    public String getMarca() {
        return this.marca;
    }
    public Integer getAno() {
        return this.ano;
    }
    public Double getValor() {
        return this.valor;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
