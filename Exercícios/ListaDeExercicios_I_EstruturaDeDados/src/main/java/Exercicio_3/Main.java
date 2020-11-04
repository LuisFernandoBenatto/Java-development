package Exercicio_3;

public class Main {
    public static void main(String[] args) {
        String[] vetorUm = {
            "Java", "C++", "C", "GO", "Ruby",
            "C#", "JavaScript", "Python", "PHP",
            "R", "Lua", "Julia"     
        };
        String[] vetorDois = new String[vetorUm.length];
        
        System.out.println("**************** Vetor Um ****************");
        for (int i = 0; i < vetorUm.length; i++) {
            System.out.println(vetorUm[i] + " ");
        }
        
        System.out.println("**************** Vetor Dois ****************");
        for (int i = 0; i < vetorDois.length; i++) {
            System.out.println(vetorDois[i] + " ");
        }
        
        System.out.println("********************************************");
        System.out.println("**************** Vetor Dois ****************");
        for (int i = 0; i < vetorUm.length; i++) {
            vetorDois[i] = vetorUm[i];
            System.out.println(vetorDois[i] + " ");
        }
    }   
}
