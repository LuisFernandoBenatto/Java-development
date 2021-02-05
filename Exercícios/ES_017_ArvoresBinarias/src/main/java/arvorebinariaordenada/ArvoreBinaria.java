package arvorebinariaordenada;

public class ArvoreBinaria<TIPO extends Comparable> {
    private Elemento<TIPO> raiz;
    
    public ArvoreBinaria() {
        this.raiz = null;
    }
    public Elemento<TIPO> getRaiz() {
        return raiz;
    }
    public void setRaiz(Elemento<TIPO> raiz) {
        this.raiz = raiz;
    }  
    public void adicionarElemento(TIPO valor) {
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        if(raiz == null) {
            this.raiz = novoElemento;
        } else {
            Elemento<TIPO> atual = this.raiz;
            while(true) {
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1) {
                    if(atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoElemento);
                        break;
                    }
                } else {
                    if(atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }
    public void imprimirPreOrdem(Elemento<TIPO> atual) {
        if(atual != null) {
            System.out.print(atual.getValor() + " ");
            imprimirPreOrdem(atual.getEsquerda());
            imprimirPreOrdem(atual.getDireita());
        } 
    }
    public void imprimirEmOrdem(Elemento<TIPO> atual) {
        if(atual != null) {
            imprimirEmOrdem(atual.getEsquerda());
            System.out.print(atual.getValor() + " ");
            imprimirEmOrdem(atual.getDireita());
        }   
    }
    public void imprimirPosOrdem(Elemento<TIPO> atual) {
        if(atual != null) {
            imprimirPosOrdem(atual.getEsquerda());
            imprimirPosOrdem(atual.getDireita());
            System.out.print(atual.getValor() + " ");
        }   
    }
}
