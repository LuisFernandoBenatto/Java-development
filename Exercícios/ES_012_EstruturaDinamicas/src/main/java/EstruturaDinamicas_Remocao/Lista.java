package EstruturaDinamicas_Remocao;

public class Lista {
    private No inicio;
    private No fim;
    
    public void inserir(No n) {
        if(inicio == null || fim == null) {
            inicio = n;
            fim = n;
            System.out.println("Elemento inserido com sucesso!!!");
        } else {
            fim.proximo = n;
            fim = n;
            System.out.println("Elemento inserido no final... "
                    + "Inserido com sucesso!");
        }
    }
    public No buscar(String no) {
        No aux = inicio;
        while(aux != null) {
            if(aux.getInfo().contains(no)) {
                return aux;
            }
            aux = aux.proximo;
        }
        return null;       
    }
    public No buscarAnterior(String no) {
        No anterior = inicio;
        while(anterior.proximo != null) {
            if(anterior.proximo.getInfo().contains(no)){
                return anterior;
            }
            anterior = anterior.proximo;
        }
        return null;
    }
    public No remover(String no) {
        No aux = inicio;
        if(inicio != null){
            if(aux.getInfo().contains(no)) {
                // Caso a lista só teha um elemento
                if(aux == fim) {
                    fim = null;
                    inicio = null;
                } else {
                    inicio = aux.proximo;
                    aux.proximo = null;
                }
            } else {
                No anterior = buscarAnterior(no);
                if(anterior != null) {
                    aux = anterior.proximo;
                    if(aux == fim) {
                        anterior.proximo = null;
                        fim = anterior;
                    } else {
                        anterior.proximo = aux.proximo;
                        aux.proximo = null;
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
                aux = aux.proximo;
            }
        }
    }
}
