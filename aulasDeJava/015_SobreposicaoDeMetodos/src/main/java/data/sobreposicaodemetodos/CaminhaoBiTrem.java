package data.sobreposicaodemetodos;

import java.time.LocalDate;

public class CaminhaoBiTrem extends Caminhao {
    private Integer cargaAdicional;
    
    public CaminhaoBiTrem() {
        this.setMarca("");
        this.setAno(0);
        this.setValor(0.0);
        this.cargaAdicional = 0;
    }
    public CaminhaoBiTrem(String marca, Integer ano, Double valor, Integer capacidadeDeCarga, Integer cargaAdicional) {
        super(marca, ano, valor, capacidadeDeCarga);
        this.cargaAdicional = cargaAdicional;
    }
    
    @Override
    public Double calcularIpva() {
        if((LocalDate.now().getYear()) - getAno()> 20) {
        return 0.0;
        } else {
          return getValor() * 0.045;      
        }
    }
    
    public Integer getCargaAdicional() {
        return cargaAdicional;
    }
    public void setCargaAdicional(Integer cargaAdicional) {
        this.cargaAdicional = cargaAdicional;
    }
}
