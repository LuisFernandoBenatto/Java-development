package Exercicio_12;

public class Pilha {
    No pilha[];
    
    int tamanho;
    // Ponteiro de controle da pilha
    int topo = -1;
    
    public Pilha(int tamanho) {
        pilha = new No[tamanho];
        this.tamanho = tamanho;
    }
    // Push - empilhar 
    public void empilhar(No no) {
        if(topo == -1 || topo < this.tamanho) {
            topo = topo + 1;
            pilha[topo] = no;
            System.out.println("Inserindo na pilha!" + no.toString());
        } else {
            System.out.println("Pilha cheia...." + no.toString());
        }
    }
    // pop - Desempilhar sempre no final
    public No desempilhar() {
        if(topo != -1) {
            No temp = pilha[topo];
            pilha[topo] = null;
            topo = topo - 1;  
            System.out.println("Desempilhando --> " + temp.toString() + "\n");
            return temp;
        } else {
            System.out.println("Pilha Vazia....");
            return null;
        }
    }
    // Imprimir Pilha
    public void imprimir() {
        for (int i = this.topo; i >= 0; i--) {
            System.out.println(i + " - " + pilha[i].toString());      
        }
        System.out.println("---------------------------");
    }
}
