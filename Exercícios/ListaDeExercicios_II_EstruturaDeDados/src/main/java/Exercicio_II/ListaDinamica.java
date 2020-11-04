package Exercicio_II;

public class ListaDinamica {
    No inicio;
    No fim;
    
    // Fazer operações da lista:
    public void inserir(No n) {
        if(inicio == null || fim == null) {
            inicio = n;
            fim = n;
            System.out.println("Elemento inserido com sucesso!!!");
        } else {
            fim.prox = n;
            fim = n;
            System.out.println("Elemento inserido no final... "
                    + "Inserido com sucesso!");
        }
    }
    public No buscar(String no) {
        No aux = inicio;
        while(aux != null) {
            if(aux.getNome().contains(no)) {
                return aux;
            }
            aux = aux.prox;
        }
        return null;       
    }
    public No buscarAnterior(String no) {
        No anterior = inicio;
        while(anterior.prox != null) {
            if(anterior.prox.getNome().contains(no)){
                return anterior;
            }
            anterior = anterior.prox;
        }
        return null;
    }
    public No remover(String no) {
        No aux = inicio;
        if(inicio != null){
            if(aux.getNome().contains(no)) {
                // Caso a lista só teha um elemento
                if(aux == fim) {
                    fim = null;
                    inicio = null;
                } else {
                    inicio = aux.prox;
                    aux.prox = null;
                }
            } else {
                No anterior = buscarAnterior(no);
                if(anterior != null) {
                    aux = anterior.prox;
                    if(aux == fim) {
                        anterior.prox = null;
                        fim = anterior;
                    } else {
                        anterior.prox = aux.prox;
                        aux.prox = null;
                    }
                } else {
                    System.out.println("Elemento não encontrado na lista");
                    return null;
                }               
            } 
            System.out.println("Elemento removido: " + " -> "+ no);
            return aux;
        } else {
            System.out.println("Lista está vazia.....");
            return null;
        }
    }
    public void imprimirLista() {
        // Ponteiro auxiliar
        No aux = inicio;
        if(inicio == null) {
            System.out.println("LISTA ESTÁ VAZIA...........................");
        } else {
            System.out.println("");
            System.out.println("Inicio da Lista: "  + inicio.getClass() + "@" +
                                      Integer.toHexString(inicio.hashCode()));
            System.out.println("Fim da Lista: "  + fim.getClass() + "@" +
                                         Integer.toHexString(fim.hashCode()));
            System.out.println("");
            while(aux != null) {
                System.out.println(aux.toString());
                aux = aux.prox;
            }
        }
    }    
}
