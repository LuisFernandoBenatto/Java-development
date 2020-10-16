/*
    2 Ao chamar o método toString( ) em um objeto de uma classe qualquer o 
    retorno é composto pelo nome do pacote + nome da classe + uma representação
    hexadecimal.
        Exemplo: veiculo.Moto@6d9c638.
    Por que ao chamar o método toString( ) em um objeto do tipo String isto é
    diferente?
 */

/**
 * Como sabemos todas as classes são herdados de
 * Object, no caso o método toString(), 
 * é instanciado para ter esse tipo de retorno:
 * Exemplo: veiculo.Moto@6d9c638
 * 
 * Mas no caso de um Objeto dotipo String ele já 
 * apresenta uma modoficação no método toString(), 
 * ou seja, ela sobrepõe o metodo toStirng em sua
 * classe
 */
package CorrecaoExercicios.Exercicio_II;

public class Main {
    public static void main(String[] args) {
        String string = new String();
        Classe classe = new Classe();
        
        System.out.println("-----------------------------------------------");
        System.out.println(string.toString()); // Redundant String.toString()
        System.out.println("");
        string = "Texto!!!!!";
        System.out.println(string.toString());
        System.out.println("");
        System.out.println(classe.toString());
        System.out.println("-----------------------------------------------");
    }
}