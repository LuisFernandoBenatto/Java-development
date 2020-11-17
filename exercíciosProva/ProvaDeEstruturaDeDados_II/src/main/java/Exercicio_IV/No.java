/*
        3) Implemente uma FILA e uma PILHA utilizando a estrutura Nó de uma 
    lista duplamente encadeada.
 */
package Exercicio_IV;

public class No {
    private String valor;
    private int ID;
    No anterior;
    No proximo;

    public No() {
        this.valor = "";
        this.ID = -1;
    }

    public No(String valor, int ID) {
        this.valor = valor;
        this.ID = ID;
    }
    public String toString (){
        if (this.proximo != null && this.anterior != null){
            return (
                "Id: " + this.ID + " - " + "Valor:  " + this.valor + " - " +
                "Ponteiro Anterior: " + this.anterior.getClass() + " - " +
                "@" + Integer.toHexString (this.anterior.hashCode())
                + " - " + "Ponteiro Proximo: " + this.proximo.getClass() + " - " +
                "@" + Integer.toHexString (this.proximo.hashCode()));
        } else if (this.proximo != null){
            return (
                "Id: = " + this.ID + " - " + "Valor:  " + this.valor + " - " +
                "Ponteiro Anterior: Null"
                + " - " + "Ponteiro Proximo: " + this.proximo.getClass()
                + "@" + Integer.toHexString (this.proximo.hashCode()));
        } else if (this.anterior != null){
            return (
                "Id: = " + this.ID + " - " + "Valor:  " + this.valor + " - " +
                "Ponteiro Anterior: " + this.anterior.getClass ()
                + "@" + Integer . toHexString (this.anterior.hashCode())
                + " - " + "Ponteiro Proximo: Null");
        } else {
            return (
            "Id: = " + this.ID + " - " + "Valor:  " + this.valor + " - " +
            "Ponteiro Anterior: Null"
            + " - " +
            "Ponteiro Proximo: Null");
        }    
    }
}
    
