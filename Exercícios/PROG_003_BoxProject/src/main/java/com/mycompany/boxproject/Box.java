package com.mycompany.boxproject;

public class Box {
    private double _largura, _altura, _comprimento;
    
    Box() {
        this._altura = 0;
        this._largura = 0;
        this._comprimento = 0;
    }
    Box(double altura, double largura, double comprimento) {
        this._altura = altura;
        this._largura = largura;
        this._comprimento = comprimento;
    }
    Box(double valorUnico) {
        this._altura = valorUnico;
        this._largura = valorUnico;
        this._comprimento = valorUnico;
    }
    public double calcularVolume() {
        double altura = Altura();
        double largura = Largura();
        double comprimento = Comprimento();
        return (altura * largura * comprimento);
    }
    public double Altura() {
        return this._altura;
    }
    public double Largura() {
        return this._largura;
    }
    public double Comprimento() {
        return this._comprimento;
    }
}
