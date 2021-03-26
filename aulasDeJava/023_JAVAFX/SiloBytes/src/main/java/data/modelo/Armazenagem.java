package data.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Armazenagem implements Serializable {

    private long numeroDaVenda;
    private String CPF_Produtor;
    private String grao;
    private int quantidade;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    
    Usuarios vendedor;
    private double valorTotal;
    private long diasArmazenamento;
    
    private static final double valorTonelada = 1000;
    
    public static double toneladaCevada = valorTonelada * 1.35;
    public static double toneladaMilho = valorTonelada * 0.925;
    public static double toneladaTrigo = valorTonelada * 1.43;
    public static double toneladaSoja = valorTonelada * 1.96;
    public static double toneladaCafe = valorTonelada * 0.717;

    public Armazenagem() {
    }

    public Armazenagem(long numeroDaVenda, String CPF_Produtor, String grao, int quantidade, LocalDate dataEntrada, LocalDate dataSaida, Usuarios vendedor, double valorTotal, long diasArmazenamento) {
        this.numeroDaVenda = numeroDaVenda;
        this.CPF_Produtor = CPF_Produtor;
        this.grao = grao;
        this.quantidade = quantidade;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.vendedor = vendedor;
        this.valorTotal = valorTotal;
        this.diasArmazenamento = diasArmazenamento;
        
        switch (this.grao) {
            case "Cevada":
            case "cevada":
            case "CEVADA":
                this.valorTotal = this.quantidade * this.diasArmazenamento * Armazenagem.toneladaCevada;
                break;
            case "Milho":
            case "milho":
            case "MILHO":
                this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaMilho;
                break;
            case "Trigo":
            case "trigo":
            case "TRIGO":
                this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaTrigo;
                break;
            case "Soja":
            case "soja":
            case "SOJA":
                this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaSoja;
                break;
            case "Cafe":
            case "cafe":
            case "CAFE":
            case "Café":
                this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaCafe;
                break;
            default:
                break;
        }
        /*
        if(this.grao.equals("Cevada") || this.grao.equals("cevada") || this.grao.equals("CEVADA")){
        this.valorTotal = this.quantidade * this.diasArmazenamento * Armazenagem.toneladaCevada;
        } else if(this.grao.equals("Milho") || this.grao.equals("milho") ||  this.grao.equals("MILHO")){
        this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaMilho;
        } else if(this.grao.equals("Trigo") || this.grao.equals("trigo") ||  this.grao.equals("TRIGO")){
        this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaTrigo;
        } else if(this.grao.equals("Soja") || this.grao.equals("soja") ||  this.grao.equals("SOJA")){
        this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaSoja;
        } else if(this.grao.equals("Cafe") || this.grao.equals("cafe") ||  this.grao.equals("CAFE") || this.grao.equals("Café")){
        this.valorTotal = this.quantidade*this.diasArmazenamento * Armazenagem.toneladaCafe;
        }*/
    }   

    public long getNumeroDaVenda() {
        return numeroDaVenda;
    }

    public void setNumeroDaVenda(long numeroDaVenda) {
        this.numeroDaVenda = numeroDaVenda;
    }

    public String getCPF_Produtor() {
        return CPF_Produtor;
    }

    public void setCPF_Produtor(String CPF_Produtor) {
        this.CPF_Produtor = CPF_Produtor;
    }

    public String getGrao() {
        return grao;
    }

    public void setGrao(String grao) {
        this.grao = grao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public long getDiasArmazenamento() {
        return diasArmazenamento;
    }

    public void setDiasArmazenamento(long diasArmazenamento) {
        this.diasArmazenamento = diasArmazenamento;
    }
    
    public String getVendedorNome(){
        return vendedor.getNome();
    }
}