package Atividade;

public class Main {
    public static void main(String[] args) {
        Class classe = new Class("esquerda", "meio", "direita");
        System.out.println(classe.toString());
        
        System.out.println("-----------------------------------------------");
        
        NewClass newClass = new NewClass();
        System.out.println("Resultado: " + newClass.getDouble(3.7));
    } 
}
