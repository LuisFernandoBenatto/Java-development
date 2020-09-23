package Questao_4.escola;

import Questao_4.sala.*;

public class Escola {
    public static void main(String[] args) {
        //System.out.println(SalaDeAula.chaveGlobal);
        SalaDeAula sala = new SalaDeAula(101, "Girafales");
        //System.out.println(sala.numeroSala);
        System.out.println(sala.andar);
        //System.out.println(sala.nomeProfessor);
    }
    
}
