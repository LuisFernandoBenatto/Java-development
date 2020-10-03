package Exercicio_14;
/*
    • Crie um menu para que o usuário escolha a opção desejada que serão as 
    operações na lista e o cálculo da lista de compras.
*/

import java.util.Scanner;

public class Menu {
    public static Scanner scanf = new Scanner(System.in);
    public static ListaDeCompras lista = new ListaDeCompras(10);
    public static void main(String[] args) {
        
        int opcao = -1;
        int contador = 0;
        
        while(opcao != 9) {
            System.out.println("**********************************");
            System.out.println("******** LISTA DE COMPRAS ********");
            System.out.println("");
            System.out.println("1 - Inserir novo produto na lista.");
            System.out.println("2 - Remover produto na lista......");
            System.out.println("3 - Buscar produto na lista.......");
            System.out.println("5 - Imprimir lista................");
            System.out.println("7 - Total da compra...............");
            System.out.println("");
            System.out.println("0 - Limpar a lista de compras.....");
            System.out.println("");
            System.out.println("9 - Sair da lista de compras......");
            System.out.println("**********************************");
            System.out.println("");
            System.out.println("Opção: " );
            
            opcao = scanf.nextInt();
            scanf.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Vamos inserir um novo produto......");
                    Produto produto = registrarProduto();
                    contador += 1;
                    
                    No no = new No(produto, contador);
                    lista.insere(no);
                    //insere();
                    break;
                case 2:
                    System.out.println("Removendo produto da lista.........");
                    No newNo = lista.remove();
                    if(newNo != null) {
                        System.out.println("Item removido: " + newNo);
                    }    
                    break;
                case 3:
                    System.out.println("Buscando elemento da lista.........");
                    buscandoProduto();
                    break;
                case 5:
                    System.out.println("Imprimindo sua lista de compras....");
                    lista.imprimeLista();
                    break;
                case 7:
                    System.out.println("Valor total da lista...............");
                    System.out.println("Total: " + lista.calcularTotal());
                    break;
                case 0:
                    System.out.println("Apagando todo o conteúdo da lista..");
                    lista.limpaLista();
                    break;
                case 9:
                    System.out.println("Tchau, até a próxima!!!............");
                    break;
                default:
                    System.out.println("Opção não existente!");
            }
        }     
    }
    public static Produto registrarProduto() {
        System.out.println("Nome do produto: ");
        String nomeDoProduto = scanf.nextLine();
        System.out.println("Valor do produto: ");
        double preco = scanf.nextDouble();
        System.out.println("Quantidade do produto: ");
        int quantidade = scanf.nextInt();
        
        Produto produto = new Produto(nomeDoProduto, preco, quantidade);
        return produto;
    }
    public static void buscandoProduto() {
        System.out.println("Nome do produro que deseja buscar: ");
        String produtoBuscar = scanf.nextLine();
        
        No no = lista.busca(produtoBuscar);
        if (no == null) {
            System.out.println("O Produto solicitado não foi encontrado");
        } else {
            System.out.println("Produto encontrado: " + no);
            System.out.println("");
        }
    }
}
