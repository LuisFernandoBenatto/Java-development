package Exercicio_14;
/*
    • Crie um menu para que o usuário escolha a opção desejada que serão as 
    operações na lista e o cálculo da lista de compras.
*/

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        var opcao = -1;
        
        while(opcao != 9) {
            System.out.println("**********************************");
            System.out.println("******** LISTA DE COMPRAS ********");
            System.out.println("");
            System.out.println("1 - Inserir novo produto na lista.");
            System.out.println("2 - Remover produto na lista......");
            System.out.println("3 - Buscar produto na lista.......");
            System.out.println("5 - Imprimir lista................");
            System.out.println("");
            System.out.println("0 - Limpara a lista de compras....");
            System.out.println("");
            System.out.println("9 - Sair da lista de compras......");
            System.out.println("**********************************");
            System.out.println("");
            System.out.println("Opção: " );
            
            opcao = scanf.nextInt();
            //scanf.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Vamos inserir um novo produto......");
                    //insere();
                    break;
                case 2:
                    System.out.println("Removendo produto da lista.........");
                    //remove();
                    break;
                case 3:
                    System.out.println("Buscando elemento da lista.........");
                    //busca();
                    break;
                case 5:
                    System.out.println("Imprimindo sua lista de compras....");
                    //imprimeLista();
                    break;
                case 0:
                    System.out.println("Apagando todo o conteúdo da lista..");
                    //limpaLista();
                    break;
                case 9:
                    System.out.println("Tchau, até a próxima!!!............");
                    break;
                default:
                    System.out.println("Opção não existente!");
            }
        }     
    }
    
}
