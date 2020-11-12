package Exercicio_IV;

public class ListaDuplamenteEncadeada {
    No inicio;
    No ultimo;
    
    public void inserir(No no) {
        if(this.inicio == null) {
            this.inicio = no;
            this.ultimo = no;
        } else {
            No aux = this.inicio;
            
            boolean continuar = true;
            while(continuar == true) {
                int comparar = aux.estudante.nome.compareTo(no.estudante.nome);
                if(comparar > 0) {
                    if(aux == this.inicio) {
                        no.prox = this.inicio;
                        this.inicio.ant = no;
                        this.inicio = no;
                    } else {
                        aux.ant.prox = no;
                        no.ant = aux.ant;
                        no.ant = aux;
                        aux.ant = no;
                    }
                    continuar = false;
                } else if(aux == this.ultimo && this.ultimo != this.inicio) {
                    no.ant = this.ultimo;
                    this.ultimo.prox = no;
                    this.ultimo = no;
                    continuar = false;
                }
                aux = aux.prox;
            }
        }
    }
    public No buscaPorNome(String elemento) {
        System.out.println("");
        System.out.println("Buscando por nome...");
        No aux = this.inicio;
        while(aux != null){
            if(aux.estudante.getNome().contains(elemento)){
                return aux;
            }
            aux = aux.prox;
        }
        System.out.println("O elemento não foi encontrado...");
        System.out.println("");
        return null;
    }
    public No removerPorNome(String elemento) {
        System.out.println("");
        System.out.println("Removendo....");
        No aux = this.inicio;
        if(aux == null) {
            System.out.println("Lista Dinamica está vazia");
            return null;
        }
        
        No item = buscaPorNome(elemento);
        if(item == null) {
            return null;
        }
        
        if(aux.estudante.getNome().contains(elemento)) {
            if(aux == this.ultimo) {
                this.ultimo = null;
                this.inicio = null;
            } else {
                this.inicio = aux.prox;
                this.inicio.ant = null;
                aux.prox = null;
            }
        } else {
            if(item == this.ultimo) {
                this.ultimo = item.ant;
                this.ultimo.prox = null;
                
                item.ant = null;
                aux = item;
            } else {
                No anterior = item.ant;
                No proximo = item.prox;
                
                anterior.prox = proximo;
                proximo.ant = anterior;
                
                item.prox = null;
                item.ant = null;
            }
        }
        System.out.println("O elemento foi Removido: " + aux);
        System.out.println("");
        return aux;
    }
    public void imprimir() {
        System.out.println("");
        System.out.println("Imprimindo....");
        No aux = this.inicio;
        while(aux != null) {
            System.out.println(aux);
            aux = aux.prox;
        }
    }
    public void imprimirReverso() {
        System.out.println("");
        System.out.println("Imprimindo Reverso....");
        No aux = this.ultimo;
        while(aux != null) {
            System.out.println(aux);
            aux = aux.ant;
        } 
    }
}