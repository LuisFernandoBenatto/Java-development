package Exercicio_14;

public abstract class ListaEstatica {
    public int prim;
    public int ultimo;

    /*
        • O método de inserção deverá receber como parâmetro um nó e deverá 
        alocá-lo na lista estática;
    */
    abstract public void insere(No n);
    /*
        • O método de limpaLista() deverá limpar a lista, ou seja excluir todos 
        os elementos da lista;
    */
    abstract public void limpaLista();
    /*
        • O método busca deverá retornar um elemento do tipo No a partir de uma 
        String, que deverá ser localizada na lista, caso não encontre, retornar
        “null”;
    */ 
    abstract public No busca(String s);
    /*
        • O método de remoção deve excluir o elemento da lista e manipular os 
        ponteiros de forma adequada de modo que a lista não perca a referência;
    */ 
    abstract public void remove(String r);
    /*
        • O método de impressão deverá utilizar o método da super classe Object 
        denominado toString(), que deverá ser implementado na classe que será 
        utilizada para ser armazenada na lista “genérica”, pois é utilizando 
        este método que o método de impressão será baseado;
    */ 
    abstract public void imprimeLista();

}
