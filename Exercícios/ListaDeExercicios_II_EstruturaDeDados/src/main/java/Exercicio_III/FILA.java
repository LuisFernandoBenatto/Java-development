package Exercicio_III;

public class FILA {
    private No primeiro;
    private No ultimo;
    
    public void inserir(No elemento) {
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = elemento;
            this.ultimo = elemento;
        } else {
            this.ultimo.anterior = elemento;
            elemento.proximo = this.ultimo;
            this.ultimo = elemento;
        }
}
    public No remover() {
        if (this.primeiro == null && this.ultimo == null){
            System.out.println("A Fila está vazia!" );
            return null ;
        }
        No item = this.primeiro ;
        if (this.primeiro == this.ultimo){
            this.primeiro = null;
            this.ultimo.anterior = null;
            this.ultimo.proximo = null;
            this.ultimo = null;
            item = null; 
        } else {
            this.primeiro = item.anterior;
            this.primeiro.proximo = null;
            item.anterior = null;
        }
        return item;
    }
    public void imprimir(){
        No aux = this.primeiro;
        while(aux != null){
            System.out.println(aux);
            aux = aux.anterior;
        }
    }
}
