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
        while(anterior != null) {
            if(anterior.proximo.getInfo().contains(no)){
                return anterior;
            }
            anterior = anterior.proximo;
        }
        return null;
    }
    public No remover(String no) {
        No aux = inicio;
        if(aux.getInfo().contains(no)) {
            inicio = aux.proximo;
            aux.proximo = null;
            return inicio;
        } else {
            No anterior = buscarAnterior(no);
            aux = anterior.proximo;
            anterior.proximo = aux.proximo;
            aux.proximo = null;
            return anterior;
        }  
    }
    public void imprimirLista() {
        // Ponteiro auxiliar
        No aux = inicio;
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
