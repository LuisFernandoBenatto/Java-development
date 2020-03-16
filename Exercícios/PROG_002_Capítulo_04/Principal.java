/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._capitulo_4;
import java.util.Scanner;
/**
 *
 * @author CC32456789830
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lampada lam = new Lampada();
        
        lam.acender();
        System.out.println(lam.mostrarEstado());        
        lam.apagar();
        System.out.println(lam.mostrarEstado());
    }
    
}
