/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._capitulo_4;

public class Lampada {
    boolean acesa;
    
    void acender(){
        acesa = true;
    }
    void apagar(){
        acesa = false;
    }
    String mostrarEstado(){
        if(acesa){
            return "acesa";
        }
        return "apagada";
    }
}
