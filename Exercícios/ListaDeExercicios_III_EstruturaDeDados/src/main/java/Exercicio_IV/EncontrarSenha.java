package Exercicio_IV;

public class EncontrarSenha {
    public int encontrarSenha(int numero, int senha) {
        if(numero == senha) {
            return numero;
        } else {
            System.out.println("Numero: " + numero);
            return encontrarSenha(numero + 1, senha);
        }
    }
}
