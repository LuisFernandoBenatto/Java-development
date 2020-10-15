/*
    1 Como impedir que um método seja sobrescrito? 
    Como impedir que uma classe seja herdada? 
    Dê exemplo com código. (Desnecessário escrever corpo de classe e de método, 
    apenas a parte essencial para mostrar o conceito).
 */
package Exercicio_I;

public class Veiculos {
    private String Modelo;
    private double Velocidade;
    private int Passageiros;
    private String Combustivel;

    public void quilometrosPorHora() {
        System.out.println("Bem rápido");
    }
    public Veiculos() {
        this.Modelo = "";
        this.Velocidade = 0.0;
        this.Passageiros = 0;
        this.Combustivel = "";
    }
    public Veiculos(String Modelo,
                       double Velocidade, int Passageiros, String Combustivel) {
        this.Modelo = Modelo;
        this.Velocidade = Velocidade;
        this.Passageiros = Passageiros;
        this.Combustivel = Combustivel;
    }
}