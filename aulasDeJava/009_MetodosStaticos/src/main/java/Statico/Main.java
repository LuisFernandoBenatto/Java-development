package Statico;

public class Main {

    public static void main(String[] args) {
        metodo(8, "Bom dia!");
        metodo_2();
        metodo_2(2);
        metodo_2(2,4,6,8,10,20,40);
        
        metodo_2("Maria");
        metodo_2("Maria", 20);
        metodo_2("Maria", 20, 40, 60, 80, 100 );
    
        metodo_2("Maria", "Turma A", "Manhã", 100);
    }
    
    
    static void metodo(int i, String string) {
        // Só para exemplo
    }
    
    /*Aceita qualquer quantidade 
      desde que seja
      um valor inteiro
    
      int ...i
      é um vetor de valores inteiros 
    */
    static void metodo_2(int ...i) {
        // Só para exemplo
        System.out.println(i.length);
        for (int idx = 0; idx < i.length; idx++) {
            System.out.println(i[idx]);
        }
    }
    
    static void metodo_2(String nome, int ...i) {
        // Só para exemplo
        System.out.println(i.length);
        System.out.println("Nome: " + nome + " - " + "Notas: ");
        for (int idx = 0; idx < i.length; idx++) {
            System.out.println(i[idx]);
        }
    }
    
    static void metodo_2(String nome, String turma, String periodo, int ...i) {
        // Só para exemplo
    }
    
}
