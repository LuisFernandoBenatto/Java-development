/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author CC32456789830
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        String nome;
        
        Cachorro c = new Cachorro();
        System.out.print("Qual o nome do cachorro?: ");
        c.lerNome();       
        System.out.print("\nO nome do seu cachorro é: " + c.nome + "\n");
        c.latir();
    }
    
}
