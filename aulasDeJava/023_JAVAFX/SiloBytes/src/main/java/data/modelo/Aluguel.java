package data.modelo;

import data.modelo.Produtores;
import data.modelo.Armazenagem;
import java.io.Serializable;
import java.time.LocalDate;

public class Aluguel implements Serializable{
    Produtores produtor;
    Armazenagem silo;
    int espacoAlugado;
    LocalDate fimAluguel, inicioAluguel;
    double total;
    boolean pago;
    
    public Aluguel() {
        this.produtor = null;
        this.silo = null;
        this.espacoAlugado = 0;
        this.inicioAluguel = null;
        this.fimAluguel = null;
        this.total = 0.0;
        this.pago = false;
    }
    
    public Aluguel(Produtores produtor, Armazenagem silo, int espacoAlugado, LocalDate inicioAluguel) {
        this.produtor = produtor;
        this.silo = silo;
        this.espacoAlugado = espacoAlugado;
        this.inicioAluguel = inicioAluguel;
    }

    public Produtores getProdutor() {
        return produtor;
    }

    public Armazenagem getSilo() {
        return silo;
    }

    public int getEspacoAlugado() {
        return espacoAlugado;
    }

    public LocalDate getFimAluguel() {
        return fimAluguel;
    }

    public LocalDate getInicioAluguel() {
        return inicioAluguel;
    }

    public double getTotal() {
        return total;
    }

    public boolean isPago() {
        return pago;
    }

    public void setProdutor(Produtores produtor) {
        this.produtor = produtor;
    }

    public void setSilo(Armazenagem silo) {
        this.silo = silo;
    }

    public void setEspacoAlugado(int espacoAlugado) {
        this.espacoAlugado = espacoAlugado;
    }

    public void setFimAluguel(LocalDate fimAluguel) {
        this.fimAluguel = fimAluguel;
    }

    public void setInicioAluguel(LocalDate inicioAluguel) {
        this.inicioAluguel = inicioAluguel;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}