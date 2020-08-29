package com.mycompany.canhao;
/**
 * @author luis fernando meneghel benatto
 */
public class ClassCanhao {
    double _angulo;
    double _alcanceDoTiro;
    int _disparar;
    
    ClassCanhao() {
        this._angulo = 0;
        this._alcanceDoTiro = 0;  
        this._disparar = 0;
    }
    ClassCanhao(double angulo, double alcanceDoTiro, int disparar) {
        this._angulo = angulo;
        this._alcanceDoTiro = alcanceDoTiro;  
        this._disparar = disparar;
    }
    public double ajustarAngulo() {
        double newAngulo = Angulo();
        return newAngulo;
    }
    public double ajustarAlcance() {
        double newAlcance = Alcance();
        return newAlcance;
    }
    
    public void dispararCanhao() {
        int newDisparo = Disparar();
        if(newDisparo == 1) {
            System.out.println("Disparando!!!");
        } else {
            System.out.println("Problemas ao Disparar");
        }
    }

    public double Angulo() {
        return this._angulo;
    }
    public double Alcance() {
        return this._alcanceDoTiro;
    }
    public int Disparar() {
        return this._disparar;
    }
}
