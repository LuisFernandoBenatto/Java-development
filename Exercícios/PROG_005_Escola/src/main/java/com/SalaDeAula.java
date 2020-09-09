package com;

public class SalaDeAula {
    private int numeroSala;
    String nomeProfessor;
    static int chaveGlobal = 54321;
    public int andar = 3;
    
    SalaDeAula(int r, String t) {
        numeroSala = r;
        nomeProfessor = t;
        
        //System.out.println(numeroSala + " - " + nomeProfessor);
    }
   
}