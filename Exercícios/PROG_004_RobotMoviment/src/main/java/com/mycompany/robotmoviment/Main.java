package com.mycompany.robotmoviment;

public class Main {
    public static void main(String[] args) {
        
        Robo _robo = new Robo("R2-D2", 0, 0);
        _robo.posicaoAtual();
        //----------------------------------------------------------------------
        _robo.mover(10, 8);
        _robo.mover(10, 6);
        _robo.posicaoAtual();
        //----------------------------------------------------------------------
        _robo.teletransportar(90, -25);
        _robo.posicaoAtual();
        //----------------------------------------------------------------------
        _robo.mover(100, 2);
        _robo.mover(100, 4);
        _robo.posicaoAtual();
        //----------------------------------------------------------------------
        _robo.teletransportar(0, 0);
        _robo.posicaoAtual();
        //----------------------------------------------------------------------
        Robo _robo2 = new Robo("Bumblebee", 0, 0);
        _robo2.posicaoAtual();
        //----------------------------------------------------------------------
        _robo2.mover(19, 8);
        _robo2.mover(7, 4);
        _robo2.posicaoAtual();
        //----------------------------------------------------------------------
        _robo2.mover(26, 2);
        _robo2.mover(14, 6);
        _robo2.posicaoAtual();
        //----------------------------------------------------------------------
        _robo2.teletransportar(10, 5);
        _robo2.posicaoAtual();
        //----------------------------------------------------------------------
        _robo2.teletransportar(0, 0);
        _robo2.posicaoAtual();
        //----------------------------------------------------------------------
    }
}
