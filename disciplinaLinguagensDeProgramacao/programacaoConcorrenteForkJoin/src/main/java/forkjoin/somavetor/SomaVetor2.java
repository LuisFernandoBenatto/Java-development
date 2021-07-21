package forkjoin.somavetor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SomaVetor2 extends RecursiveTask<Integer> {
    private final List<Integer> lista;
    private static int LIMITE = 100_000; 
 
    public SomaVetor2(List<Integer> lista) {
        this.lista = lista; 
    }
 
    @Override
    protected Integer compute() {
        if (lista.size() <= LIMITE){
            return lista.stream().reduce(0, Integer::sum); 
        }    
        else {            
            int meio = lista.size() / 2 ;
            List<Integer> esquerda = lista.subList(0, meio); 
            List<Integer> direita  = lista.subList(meio, lista.size()); 
            SomaVetor2 subTarefa1 = new SomaVetor2(esquerda);
            SomaVetor2 subTarefa2 = new SomaVetor2(direita);
            subTarefa2.fork();
            return subTarefa1.compute() + subTarefa2.compute(); 
        }         
    }
}