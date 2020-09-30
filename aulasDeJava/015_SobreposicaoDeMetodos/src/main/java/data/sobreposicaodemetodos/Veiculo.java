package data.sobreposicaodemetodos;

public class Veiculo {
    private String marca;
    private Integer ano;
    private Double valor;
    private String placa;
    
    public Veiculo() {
        this.marca = "";
        this.ano = 0;
        this.valor = 0.0;
        this.placa = "";
    }
    
    public Veiculo(String marca, Integer ano, Double valor, String placa) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.placa = placa;
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
    public String getPlaca() {
        return this.placa;
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
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String toString() {
        return "Marcar : " + this.marca + " - " +
                "Ano: " + this.ano + " - " +
                "Valor: " + this.valor + " - " +
                "Placa: " + this.placa;
    }
    @Override
    public boolean equals(Object obj){
      if (obj == null) {
          return false;
      }

      final Veiculo other = (Veiculo) obj;
      if ((this.placa == null) ? (other.placa != null) : !this.placa.equals(other.placa)) {
          return false;
      } else {
          return true;
      }     
    }
}
