package data.fila;

public class FilaCircular {
    int tamanho = 10;
    No fila[];
    int inicio = -1;
    int fim = -1;

    public FilaCircular(int tamanho){
        fila = new No[tamanho];
        this.tamanho = tamanho;
    }
    // Método que retorna a próxima posição possível da Fila Circular....
    // Verificar qual é o proximo elemento
    public int proximo(int ponteiro){
        if(ponteiro < (this.tamanho - 1)) {
            return ponteiro + 1;
        } else {
            return 0;
        }
    }
    // Na fila insere no fim
    public void inserir(No no) {
        // Verificando se a fila está vazia
        if(inicio == -1 || fim == -1) {
            inicio = 0;
            fim = 0;
            fila[inicio] = no;
            System.out.println("Elemento inserido!!!" + no.toString());
        } else if(proximo(fim) != inicio) {
            //Fila não está cheia....
            fim = proximo(fim);
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
        if(this.inicio != -1) {
            No temp = fila[inicio]; 
            if(inicio == fim) {
                fila[inicio] = null;
                inicio = -1;
                fim = -1;
            } 
            inicio = proximo(inicio);
            System.out.println("Removido com sucesso!!!" + temp.toString());
            return temp;
        } else {
            System.out.println("Lista está vazia!");
            return null;
        }     
    }
    // Imprimir fila
    public void imprimir(){
        if(inicio != -1) {
            System.out.println("Ponteiros -> " +
                    "Inicio: " + this.inicio + " - " +
                    "Fim: " + this.fim);
            int aux = this.inicio;
            do {
                System.out.println(fila[aux].toString());
                aux = proximo(aux);
            } while(aux != proximo(fim));
        }
    }
}
