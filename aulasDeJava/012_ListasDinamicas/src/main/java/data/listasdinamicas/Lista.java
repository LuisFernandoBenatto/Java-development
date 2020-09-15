package data.listasdinamicas;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args) {
        Caixa novaCaixa[] = new Caixa[20];
        ArrayList<String> lista = new ArrayList();
    
        ArrayList<Integer> valores = new ArrayList();
        
        System.out.println("###############################################");
        System.out.println("Tamanho " + lista.size());
        lista.add("Vermelho");
        lista.add("Azul");
        lista.add("Amarelo");
        lista.add("Verde");
        System.out.println("Tamanho " + lista.size());
        
        lista.set(2, "Azul Escuro");
        lista.set(3, "Marrom");
        System.out.println("Tamanho " + lista.size());
        
        System.out.println("###############################################");
        System.out.println(lista.get(3));
        System.out.println("###############################################");
        
        System.out.println(lista);
        
        lista.remove(0);
        System.out.println(lista);
        
        //Limpa a lista toda!
        //lista.clear();
        System.out.println(lista);
        
        System.out.println("###############################################");
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("###############################################");
        for(String x: lista) {
            System.out.println(x);
        }
        
        lista.forEach(x -> {
            System.out.println(x);
        });
        
        System.out.println("###############################################");
        
        lista.add(1, "Preto");
        lista.add(2, "Cinza");
        System.out.println(lista);
    
        System.out.println("###############################################");
        
        lista.clear();
        
        lista.add("Vermelho");
        lista.add("Azul");
        lista.add("Amarelo");
        lista.add("Verde");
        lista.add("Preto");
        lista.add("Cinza");
        lista.add("Branco");
        lista.add("Marrom");
        
        Collections.sort(lista);
        
        for(String x: lista) {
            System.out.println(x);
        }
        System.out.println("###############################################");      
    }  
}
