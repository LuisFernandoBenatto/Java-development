package data.modelo;

import java.io.Serializable;

public class Armazenagem implements Serializable {
    private String endereco;
    private double capacidade;
    private boolean alugado;
    
    private double disponivel;
    public Armazenagem() {
        this.endereco = "";
        this.capacidade = 0.0;
        this.alugado = false;
        this.disponivel = 0.0;
    }
    
    public Armazenagem(String endereco, double capacidade, boolean alugado){
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.alugado = alugado;
        this.disponivel = capacidade;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public double getCapacidade() {
        return capacidade;
    }
    
    public boolean getAlugado() {
        return alugado;
    }
    
    public double getDisponivel() {
        return disponivel;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
    
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    
    public void setDisponivel(double disponivel) {
        this.disponivel = disponivel;
    }
}