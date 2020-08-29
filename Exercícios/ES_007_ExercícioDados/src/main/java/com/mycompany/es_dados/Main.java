package com.mycompany.es_dados;

public class Main {
    public static void main(String[] args) {
        
        ClassDado vet[] = new ClassDado[5];
        int ultimo = -1;

        for(int i = 0; i < vet.length; i++) {
            vet[i] = new ClassDado();
        }
        
        ClassDado d = new ClassDado();
        d.cadastrar("Caderno", 1);
        ultimo = inserirDado(vet, d, ultimo);
        
        ClassDado d2 = new ClassDado();
        d2.cadastrar("Caneta", 2);
        ultimo = inserirDado(vet, d2, ultimo);
        
        ClassDado d3 = new ClassDado();
        d3.cadastrar("Apontador", 3);
        ultimo = inserirDado(vet, d3, ultimo);
        
        ClassDado d4 = new ClassDado();
        d4.cadastrar("Marca Texto", 4);
        ultimo = inserirDado(vet, d4, ultimo);
        
        ClassDado d5 = new ClassDado();
        d5.cadastrar("Lapis", 5);
        ultimo = inserirDado(vet, d5, ultimo);
        
        for(int i = 0; i < vet.length; i++) {
            System.out.println(vet[i].imprimir());
        }
    }
    public static int inserirDado(ClassDado vet[], ClassDado d, int ponteiro) {
        if(ponteiro < vet.length) {
            ponteiro++;
            vet[ponteiro] = d;
            System.out.println("Ponteiro: " + ponteiro);
            System.out.println("Inserido com sucesso!!!");    
        } else {
            System.out.println("Lista cheia!");
        }
        
        return ponteiro;
    }   
}
