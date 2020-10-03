package Exercicio_14;
/*
    • Então crie uma nova classe chamada ListaCompras que herde os atributos e 
    métodos da classe que implementa às listas genéricas, e na ListaCompras 
    implemente o método de calculoTotal que deverá calcular o valor total em 
    produtos armazenados na listaCompras e imprimir o valor na tela.
 */
public class ListaDeCompras extends ListaEstatica {
    private double calcularTotal;
    
    public ListaDeCompras() {
        this.calcularTotal = 0.0;
    }
    public ListaDeCompras(double calcularTotal) {
        this.calcularTotal = calcularTotal;
    }
    public Double getCalcularTotal() {
        return this.calcularTotal;
    }
    public void setCalcularTotal(double calcularTotal) {
        this.calcularTotal = calcularTotal;
    }
    //--------------------------------------------------------------------------
    final int TAMANHO = 5;
    No produto[] = new No[TAMANHO];
    //--------------------------------------------------------------------------
    @Override
    public void insere(No no) {
        // Verificando se a lista está vazia
        if(this.prim == -1 || this.ultimo == -1) {
            prim = 0;
            ultimo = 0;
            produto[prim] = no;
            System.out.println("Elemento inserido na Lista!!!" + no.toString());
        } else if(ultimo < produto.length) {
            //Fila não está cheia....
            ultimo = ultimo + 1;
            produto[ultimo] = no;
            System.out.println("Elemento inserido na Lista!!!" + no.toString());
        } else {
            System.out.println("A Lista já está cheia!!!" + no.toString());
        }
    }
    //--------------------------------------------------------------------------
    @Override
    public void limpaLista() {
        produto = new No[TAMANHO];      
    }
    //--------------------------------------------------------------------------
    @Override
    public No busca(String s) {
        for (int i = this.prim; i <= this.ultimo; i++) {
            if(produto[i].getNomeProduto().contains(s)) {
                return produto[i];
            } else {
                System.out.println((i + 1) + " - " + " Nome diferente!");
            }
        }
        return null;    
    }
    //--------------------------------------------------------------------------
    @Override
    public void remove(String r) {
        // Verificando se a lista está vazia
        if(this.prim == -1 || this.ultimo == -1) {
            produto[ultimo] = null;
            ultimo--;  
        } else {
            System.out.println("A Lista já está cheia!!!");
        }
    }
    //--------------------------------------------------------------------------
    @Override
    public void imprimeLista() {
        for (int i = this.prim; i <= this.ultimo; i++) {
            System.out.println(i + " - " + produto[i]);
        }
    }
    //--------------------------------------------------------------------------
    public No getElement(int i) {
        if(i <= ultimo) {
            return produto[i];
        }else {
            return null;
        }
    }
    //--------------------------------------------------------------------------
}
