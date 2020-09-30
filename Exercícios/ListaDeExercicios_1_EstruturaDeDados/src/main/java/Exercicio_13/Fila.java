package Exercicio_13;

public class Fila {
    final int tamanho = 10;
    No fila[] = new No[tamanho];
    int comeco = 0;
    int fim = -1;
    
    // Na fila insere no fim
    public void inserir(No no) {
        // Verificando se a fila está vazia
        if(comeco == -1) {
            comeco = 0;
            fim = 0;
        } else if(fim < tamanho - 1) {
            fim = fim + 1;
            fila[fim] = no;
            System.out.println("Elemento inserido!!!" + no.toString());
        } else {
            System.out.println("A fila já está cheia!!!" + no.toString());
        }
        
    }
    // Na fila remove o comeco
    public No remover() {
        System.out.println("Removendo...." );
        // Fila não vazia
        if(this.comeco != -1) {
            No temp = fila[comeco];
            for (int i = this.comeco; i < fim; i++) {
                // Operação de deslocamento
                fila[i] = fila[i + 1];
            }
            fim = fim - 1;
            System.out.println("Removido com sucesso!!!" + temp.toString());
            return temp;
        } else {
            System.out.println("Lista está vazia!");
            return null;
        }     
    }
    // Imprimir fila
    public void imprimir(){
        for (int i = this.comeco; i <= this.fim; i++) {
            System.out.println(i + " - " + fila[i]);
        }
    }
}
