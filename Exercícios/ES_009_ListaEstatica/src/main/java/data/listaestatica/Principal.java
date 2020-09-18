package data.listaestatica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        Lista l = new Lista();
        //----------------------------------------------------------------------
        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite o nome para inserir na lista: ");
            String nome = scanf.nextLine();
            No novoNo = new No(nome);
            
            l.inserir(novoNo);          
        }
        l.imprimirLista();
        //----------------------------------------------------------------------
        String nomeParaBuscar = "Noel";
        int j = l.buscar(nomeParaBuscar);
        if(j == -1) {
            System.out.println("Nome não encontrado!!!");
        } else {
            No encontrado = l.getElement(j);
            System.out.println("----> " 
                    + "Posição: " + (j + 1) 
                    + " - " 
                    + "Encontrado --> " + encontrado.toString());
        }
        //----------------------------------------------------------------------
        String nomeParaRemover = "Joao";
        l.remover(nomeParaRemover);
        l.imprimirLista();
        //----------------------------------------------------------------------
    }
}
