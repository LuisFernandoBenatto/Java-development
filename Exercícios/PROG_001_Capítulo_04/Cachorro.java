/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;	
import java.util.Scanner;

/**
 *
 * @author CC32456789830
 */
public class Cachorro {
    
    Scanner scanf = new Scanner(System.in);
    
    String nome;
    int idade;
    
    //Construtor
    Cachorro(){
        idade = 0;
        nome = "";
    }
    
    void latir(){
        System.out.println("Au au!!!");        
    }
    String lerNome(){
        nome = scanf.nextLine();
        return nome;
    }
    
}
