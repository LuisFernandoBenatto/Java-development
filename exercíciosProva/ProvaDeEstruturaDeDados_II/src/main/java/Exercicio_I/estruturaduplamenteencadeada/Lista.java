package Exercicio_I.estruturaduplamenteencadeada;

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
            n.anterior = n;
            fim = n;
            System.out.println("Elemento inserido no final... "
                    + "Inserido com sucesso!");
        }
    }
    public void imprimirLista() {
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
    public void imprimirListaInversa() {
        No aux = fim;
        System.out.println("");
        System.out.println("Inicio da Lista: "  + inicio.getClass() + "@" +
                                      Integer.toHexString(inicio.hashCode()));
        System.out.println("Fim da Lista: "  + fim.getClass() + "@" +
                                         Integer.toHexString(fim.hashCode()));
        System.out.println("");
        while(aux != null) {
            System.out.println(aux.toString());
            aux = aux.anterior;        
        }
    }
    public No remover(String s) {
        if (inicio != null) {
            No aux = inicio;

            if (inicio == fim) {
                inicio = null;
                fim = null;
                return aux;
            } else {
                while (aux != null) {
                    if (aux.nome.contains(s)) {
                        No ant = aux.anterior;
                        No prox = aux.proximo;

                        ant.proximo = prox;
                        prox.anterior = ant;
                        aux.proximo = null;
                        aux.anterior = null;
                        return aux;
                    }
                    aux = aux.proximo;
                }
            }
        } else {
            System.out.println("Lista está vazia!");
            return null;
        }
        return null;
    }
    public void swap(No n1, No n2) {
        int temp_id = n1.getId();
        String temp_info = n1.getInfo();

        int temp2_id = n2.getId();
        String temp2_info = n2.getInfo();

        n1.setId(temp2_id);
        n1.setInfo(temp2_info);

        n2.setId(temp_id);
        n2.setInfo(temp_info);
  }
}
