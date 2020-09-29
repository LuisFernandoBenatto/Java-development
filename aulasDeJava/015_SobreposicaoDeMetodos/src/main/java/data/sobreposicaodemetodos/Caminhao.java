package data.sobreposicaodemetodos;

import java.time.LocalDate;

// Sub-classe de Veiculos
public class Caminhao extends Veiculo {
    private Integer capacidadeDeCarga;
    
    public Caminhao() {
        this.setMarca("");
        this.setAno(0);
        this.setValor(0.0);
        this.capacidadeDeCarga = 0;
    }
    
    public Caminhao(String marca, Integer ano, Double valor, Integer capacidadeDeCarga) {
        super(marca, ano, valor);
        this.capacidadeDeCarga = capacidadeDeCarga ;
    }
    
    public Double calcularIpva() {
        Integer idade = (LocalDate.now().getYear()) - getAno();
        if(idade > 20) {
            return 0.0;
        } else {
            return getValor() * 0.04;
        }
    }
    
    public Integer getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
    public void setCapacidadeDeCarga(Integer capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
}
