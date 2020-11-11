package Exercicio_III;

public class PILHA {
    private No topo;
    
    public void empilhar(No item){
        if (this.topo == null) {
            this.topo = item;
        } else {
            this.topo.proximo = item;
            item.anterior = this.topo;
            this.topo = item;
        }
    }
    public No desempilhar(){
        if (this.topo == null){
            System.out.println("Pilha está vazia!!!");
            return null;
        }
        No topo_ = this.topo ;
        if (topo.anterior == null) {   
            this.topo.proximo = null;
            this.topo = null;
        } else {
            No anterior_ = topo_.anterior;
            anterior_.proximo = null;
            topo_.anterior = null ;
            this.topo = anterior_ ;
        }
        return topo_ ;
    }
    public void imprimir(){
        No aux = this.topo;
        while ( aux != null ) {
            System.out.println(aux);
            aux = aux.anterior;
        }
    }
}