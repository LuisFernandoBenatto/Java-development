package Exercicio_5;

import java.util.Scanner;

public class Apostas {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int vetorResposta[] = new int[13]; 
        int quantApostadores = 0;
        
        vetorResposta = resultadoDaLoterica(vetorResposta);
        System.out.println("Insira a quantidade de Apostadores: ");  
        quantApostadores = scanf.nextInt();
        scanf.nextLine();
        
        Apostador apostadores[] = new Apostador[quantApostadores];
        apostadores = inserir(apostadores, quantApostadores);     
        
        verificarApostas(apostadores, vetorResposta);
    }
    public static int[] resultadoDaLoterica(int resultado[]) {
        System.out.println("Inserir o gabarito da Loterica");
        Scanner scanf = new Scanner(System.in);
        int valorSorteado = 0;
        for (int i = 0; i < 13; i++) {
            valorSorteado = scanf.nextInt();
            scanf.nextLine();
            
            resultado[i] = valorSorteado;
        }
        return resultado;
    }
    public static Apostador[] inserir(Apostador apostadores[], int quantApostadores) {
        Scanner scanf = new Scanner(System.in);
        String nome = "";
        for (int i = 0; i < quantApostadores; i++) {
            System.out.println("Nome do apostador: ");
            nome = scanf.next();
            scanf.nextLine();
            
            System.out.println("Inserir as apostas: ");
            int valorApostado = 0;
            int apostas[] = new int[13];
            for (int j = 0; j < 13; j++) {
                valorApostado = scanf.nextInt();
                scanf.nextLine();
                
                apostas[j] = valorApostado;
            }
            
            Apostador apostador = new Apostador(nome, apostas);
            apostadores[i] = apostador;
        }
        return apostadores;
    }
    public static void verificarApostas(Apostador apostadores[], int resultados[]) {
        for (Apostador apostador : apostadores) {
            int contador = 0;
            int cloandoRespostas[] = resultados.clone();
            for (int i = 0; i < 13; i++) {
                int valor = apostador.getAposta()[i];
                for (int j = 0; j < 13; j++) {
                    if(cloandoRespostas[j] == valor) {
                        cloandoRespostas[j] = -1;
                        contador++;
                    }
                }
            }
            if(contador == 13) {
                System.out.println("");
                System.out.println("GANHADOR, PARABENS");
                System.out.println("");
            }
            System.out.println(
                    "Nome: " + apostador.getNome() +
                    " | " +"Acertou: " + contador);
            System.out.println("");
        }
    }
}
