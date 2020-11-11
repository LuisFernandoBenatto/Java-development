package Exercicio_II;

import java.util.Scanner;

public class Menu {
    
    public static Scanner scanf = new Scanner(System.in);
    public static ListaDinamica listaDinamica = new ListaDinamica();

    public static void main(String[] args) {
        
        int opcao = -1;
        
        while(opcao != 0) {
            System.out.println("**********************************");
            System.out.println("******** LISTA DINAMICA **********");
            System.out.println("");
            System.out.println("1 - Inserir.......................");
            System.out.println("2 - Remover.......................");
            System.out.println("3 - Buscar........................");
            System.out.println("4 - Imprimir lista................");
            System.out.println("");
            System.out.println("0 - Sair da lista.................");
            System.out.println("**********************************");
            System.out.println("");
            System.out.println("Opção: " );
            
            opcao = scanf.nextInt();
            scanf.nextLine();
            
            switch(opcao) {
                case 1:
                    System.out.println("Vamos inserir um novo registo......");
                    No registro = registrar();
                    No no = registro;
                    listaDinamica.inserir(no);
                    break;
                case 2:
                    System.out.println("Removendo produto da lista.........");
                    removendo();
                    break;
                case 3:
                    System.out.println("Buscando elemento da lista.........");
                    buscando();
                    break;
                case 4:
                    System.out.println("Imprimindo sua lista ..............");
                    System.out.println("");
                    listaDinamica.imprimirLista();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Tchau, até a próxima!!!............");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção não existente!");
                    System.out.println("");
            }
        }
    }
    public static No registrar() {
        System.out.println("Nome: ");
        String nome = scanf.nextLine();
        System.out.println("Altura: ");
        float altura = scanf.nextFloat();
        System.out.println("Peso: ");
        float peso = scanf.nextFloat();
        scanf.nextLine();
        System.out.println("Esporte: ");
        String esporte = scanf.nextLine();
         System.out.println("Patrocinador: ");
        String patrocinador = scanf.nextLine();

        No registro = new No(nome, altura, peso, 
                                        esporte, patrocinador);
        return registro;
    }
    public static void buscando() {
        System.out.println("Nome que deseja buscar: ");
        String registroBuscar = scanf.nextLine();
        
        No no = listaDinamica.buscar(registroBuscar);
        if (no == null) {
            System.out.println("O Registro solicitado não foi encontrado");
        } else {
            System.out.println("Registro encontrado: " + no);
            System.out.println("");
        }
    }
    public static void removendo() {
        System.out.println("Nome que deseja remover: ");
        String registroRemover = scanf.nextLine();
        
        No no = listaDinamica.remover(registroRemover);
        if (no == null) {
            System.out.println("O Registro solicitado não foi encontrado");
        } else {
            System.out.println("Registro removido: " + no);
            System.out.println("");
        }
    }
}
/*
        ListaDinamica listaDinamica = new ListaDinamica();
        
        No n;
        System.out.println("Inserindo.....");
        n = new No("Joaquim", 195, 82, "Basquete", "Nike");
        listaDinamica.inserir(n);
        n = new No("Juvenil", 170, 65, "Natação", "Correios");
        listaDinamica.inserir(n);
        n = new No("Marcela", 160, 55, "Futsal", "Adidas");
        listaDinamica.inserir(n);
        
        listaDinamica.imprimirLista();
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Buscando.....");
        No buscado = listaDinamica.buscar("Joaquim");
        System.out.println(buscado.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Inserindo +.....");
        n = new No("Diana", 180, 73, "Vôli", "Hinode");
        listaDinamica.inserir(n);
        n = new No("Roberta", 169, 70, "HandBoll", "Gatorade");
        listaDinamica.inserir(n);
        n = new No("Manoela", 155, 61, "Boxe", "UFC");
        listaDinamica.inserir(n);
        
        listaDinamica.imprimirLista();
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Buscando.....");
        No buscado_2 = listaDinamica.buscar("Manoela");
        System.out.println(buscado_2.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.println("Removendo......");
        No removido = listaDinamica.remover("Marcela");
        System.out.println("Remoção: " + removido.toString());
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        listaDinamica.imprimirLista();
        System.out.println("-----------------------------------------------"); 
        */
