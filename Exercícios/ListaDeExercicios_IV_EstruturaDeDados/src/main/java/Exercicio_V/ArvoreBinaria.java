package Exercicio_V;

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
                if(novoElemento.getValor().compareTo(atual.getValor()) == -1) 
                {
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
    public int consultar(TIPO valor) {
        // Busca o elemento na árvore
        if(raiz == null) {
            System.out.println("Raiz igual a null");
            return 0;
        }
        Elemento<TIPO> atual = this.raiz;
        while(atual != null){
            if(atual.getValor().equals(valor)){
                System.out.print("Valor encontrado: ");
                return 1;
            } else if(valor.compareTo(atual.getValor()) == -1){ 
                atual = atual.getEsquerda();
            } else {   
                atual = atual.getDireita();
            }
        }
        System.out.print("Valor não encontrado: ");
        return 0;
    }
    public boolean remover (TIPO valor){
        // Busca o elemento na árvore
        Elemento<TIPO> atual = this.raiz;
        Elemento<TIPO> paiAtual = null;
        while(atual != null){
            if(atual.getValor().equals(valor)){
                break;
            } else if(valor.compareTo(atual.getValor()) == -1){
                // valor procurado é menor que o atual 
                paiAtual = atual;
                atual = atual.getEsquerda();
            } else {   
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        // verificar se existe o elemento
        if(atual != null) {
            // elementos tem dois filhos ou somente filho a direita
            if(atual.getDireita() != null) {
                Elemento<TIPO> substituto = atual.getDireita();
                Elemento<TIPO> paiSubstituto = atual;
                while(substituto.getEsquerda() != null) {
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }
                substituto.setEsquerda(atual.getEsquerda());
                if(paiAtual != null) {
                    if(atual.getValor()
                            .compareTo(paiAtual.getValor()) == -1) { 
                    // atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    } else {
                        paiAtual.setDireita(substituto);
                    }
                } else { // se não tem paiAtual, quer dizer que é a raiz
                    this.raiz = substituto;
                }
                
                //removeu o elemento da árvore
                if(substituto.getValor()
                        .compareTo(paiSubstituto.getValor()) == -1) { 
                // substituto < paiSubstituto
                   paiSubstituto.setEsquerda(null);
                } else {
                    paiSubstituto.setDireita(null);
                }
        
            } else if(atual.getEsquerda() != null) {
                // tem filho só à esquerda
                Elemento<TIPO> substituto = atual.getEsquerda();
                Elemento<TIPO> paiSubstituto = atual;
                while(substituto.getDireita() != null) {
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }
                if(paiAtual != null) {
                    if(atual.getValor()
                            .compareTo(paiAtual.getValor()) == -1) { 
                    // atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    } else {
                        paiAtual.setDireita(substituto);
                    }
                } else { // se não tem paiAtual, quer dizer que é a raiz
                    this.raiz = substituto;
                }
                //removeu o elemento da árvore
                if(substituto.getValor()
                        .compareTo(paiSubstituto.getValor()) == -1) { 
                // substituto < paiSubstituto
                   paiSubstituto.setEsquerda(null);
                } else {
                    paiSubstituto.setDireita(null);
                }
            } else {
                // não tem filhos
                if(paiAtual != null) {
                    if(atual.getValor()
                            .compareTo(paiAtual.getValor()) == -1) { 
                    // atual < paiAtual
                        paiAtual.setEsquerda(null);
                    } else {
                        paiAtual.setDireita(null);
                    }
                } else {// é a raiz
                    this.raiz = null;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
