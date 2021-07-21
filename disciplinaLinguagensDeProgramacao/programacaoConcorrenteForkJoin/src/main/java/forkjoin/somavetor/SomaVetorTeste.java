package forkjoin.somavetor;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class SomaVetorTeste {

    public static void main(String[] args) {
        int QUANTIDADE = 1_000_000;
        Integer arr[] = new Integer[QUANTIDADE];
        Random gerador = new Random();
        for (int i = 0; i < QUANTIDADE; i++) {
            arr[i] = gerador.nextInt();
        }
        
        long inicio = System.currentTimeMillis();
        int soma=0;
        for (int i = 0; i < QUANTIDADE; i++) {
            soma += arr[i];
        }
        long fim = System.currentTimeMillis();
        System.out.println("Soma: " + soma);
        System.out.println("Tempo soma convencional: " + (fim - inicio));        
        
//        SomaVetor somaVetor = new SomaVetor(arr);
//        inicio = System.currentTimeMillis();
//        soma = somaVetor.compute();
//        System.out.println("Soma: "+ soma);
//        fim = System.currentTimeMillis();
//        System.out.println("Tempo soma paralela....: " + (fim - inicio));
        
        SomaVetor sv = new SomaVetor(arr);
        inicio = System.currentTimeMillis();        
        int paralelismo = ForkJoinPool.getCommonPoolParallelism();       
        ForkJoinPool pool = (ForkJoinPool) Executors.newWorkStealingPool(paralelismo);
        soma = pool.invoke(sv); 
        System.out.println("Soma: "+ soma);
        fim = System.currentTimeMillis();
        System.out.println("Tempo soma paralela 2..: " + (fim - inicio));
        pool.shutdown();
    }
}
