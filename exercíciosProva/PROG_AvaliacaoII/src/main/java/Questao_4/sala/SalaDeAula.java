package Questao_4.sala;

public class SalaDeAula {
   private int numeroSala; 
   String nomeProfessor;
   static int chaveGlobal = 54321; 
   public int andar = 3;
   
   public SalaDeAula(int r, String t) { 
       numeroSala = r;
       nomeProfessor = t;
   }
}
