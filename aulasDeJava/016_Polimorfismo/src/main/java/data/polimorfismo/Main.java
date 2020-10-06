package data.polimorfismo;


public class Main {
    public static void main(String[] args) {
        Aluno aluno_1 = new Aluno("José Garcia", "123456789");
        System.out.println("Aluno: " + aluno_1.getNome(false) + " - " + aluno_1.getMatricula());
        
        Aluno aluno_2 = new Aluno();
        aluno_2.setNome("Lucas Miguel");
        aluno_2.setMatricula("2345678891");
        System.out.println("Aluno: " + aluno_2.getNome(true) + " - " + aluno_2.getMatricula());      
    }
    
}
