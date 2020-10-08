package data.provadeestruturadedados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        ListaEstatica lista = new ListaEstatica(10);
        
        for (int i = 0; i <= 2; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Lista de produtos");
            System.out.println("Codigo do Produto: ");
            int codigo = scanf.nextInt();
            scanf.nextLine();
            System.out.println("Nome do Produto: ");
            String nome = scanf.nextLine();
            System.out.println("Preço de Compra: ");
            float compra = scanf.nextFloat();
            scanf.nextLine();
            System.out.println("Preço de Venda: ");
            float venda= scanf.nextFloat();
            scanf.nextLine();
            
            Produtos novoProduto = new Produtos(codigo,
                    nome, compra, venda);
            
            lista.inserir(novoProduto);          
        }
        lista.imprimirLista();
        
        lista.remover(1);
        lista.remover(2);
        lista.imprimirLista();
        
    }
    
}
