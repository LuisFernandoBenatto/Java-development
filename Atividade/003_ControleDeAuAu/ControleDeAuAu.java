/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crie a classe ​Cachorro ​com os atributos ​raca ​e ​nome ​(Strings), sem construtores
explícitos. Crie um método ​latir( )​, que não recebe parâmetros e imprime na tela a
mensagem “auau”. Crie o método ​latirRepetido( )​ que recebe um inteiro como
parâmetro, correspondente ao número de vezes que será impresso na tela a
mensagem “auau”. Restrições: se o parâmetro for menor que zero, a mensagem
deve ser “bugou”; se for maior que 100, a mensagem deve ser “parâmetro inválido”.
Crie o método ​verNome( )​ que ​retorna​ o nome do cachorro.
 */
package controledeauau;
/**
 *
 * @author luis_
 */
public class ControleDeAuAu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro cao = new Cachorro();
        
        cao.nome = "Doguinho";
        cao.raca = "Labrador";

        cao.latirRepetido(11);
        System.out.println("Nome do cachorro: " + cao.verNome() +"  -  "+ "Da raca: " + cao.verRaca());      
    }
    
}
