/*
1-Dadas as definições de classe com.SalaDeAula e com.Escola, quais números de
linha no método main( ) irão gerar erro de compilação (pode haver mais de uma)?
Se houver erros de compilação, explique o motivo do erro.
[Tente resolver sem digitar e compilar o código]
*/
package com;

public class Escola {

    public static void main(String[] args) {
        System.out.println(SalaDeAula.chaveGlobal);

        SalaDeAula sala = new SalaDeAula(101, "Girafales");
        
        System.out.println(sala.andar);
        System.out.println(sala.nomeProfessor);
        //System.out.println(sala.numeroSala);
        
    }
    
}
