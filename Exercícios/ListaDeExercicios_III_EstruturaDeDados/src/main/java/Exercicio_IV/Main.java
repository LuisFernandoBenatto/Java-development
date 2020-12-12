package Exercicio_IV;

public class Main {
    public static void main(String[] args) {
        EncontrarSenha encontrar = new EncontrarSenha();
        System.out.println("Teste com 1 dígitos");
        int senha = 1;
        System.out.println("Senha: " + 
                encontrar.encontrarSenha(0, senha));
        
        System.out.println("Teste com 2 dígitos");
        senha = 12;
        System.out.println("Senha: " + 
                encontrar.encontrarSenha(0, senha));
        
        System.out.println("Teste com 3 dígitos");
        senha = 123;
        System.out.println("Senha: " + 
                encontrar.encontrarSenha(0, senha));
        
        System.out.println("Teste com 4 dígitos");
        senha = 1234;
        System.out.println("Senha: " + 
                encontrar.encontrarSenha(0, senha));
        
        System.out.println("Teste com 5 dígitos");
        senha = 12345;
        System.out.println("Senha: " + 
                encontrar.encontrarSenha(0, senha));
   }   
}
