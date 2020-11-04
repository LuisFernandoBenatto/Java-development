package Exercicio_14;
/*
    • Então crie uma nova classe chamada ListaCompras que herde os atributos e 
    métodos da classe que implementa às listas genéricas, e na ListaCompras 
    implemente o método de calculoTotal que deverá calcular o valor total em 
    produtos armazenados na listaCompras e imprimir o valor na tela.
 */
public class ListaDeCompras extends ListaEstatica {
    private final int TAMANHO;
    private No[] no;
    private double calcularTotal;
    
    public ListaDeCompras(int tamanho) {
        this.TAMANHO = tamanho;
        this.no = new No[TAMANHO];
        this.prim = 0;
        this.ultimo = 0;
        this.calcularTotal = 0.0;
    }
    public Double getCalcularTotal() {
        return this.calcularTotal;
    }
    public void setCalcularTotal(double calcularTotal) {
        this.calcularTotal = calcularTotal;
    }
    //--------------------------------------------------------------------------
    @Override
    public void insere(No n) {
        if(ultimo < no.length) {
            // Tenho espaço...
            no[ultimo] = n; // Insere o elemento na posição
            ultimo = (ultimo + 1) % no.length; // Atualizando o ponteiro
            System.out.println("Item inserido com sucesso!!!");
        } else {
            System.out.println("A lista está cheio! Volte amanhã!");
        }
    }
    //--------------------------------------------------------------------------
    @Override
    public void limpaLista() {
        this.no = new No[TAMANHO]; 
        this.prim = 0;
        this.ultimo = 0;
    }
    //--------------------------------------------------------------------------
    @Override
    public No busca(String s) {
        for (int i = this.prim; i <= this.ultimo; i++) {
            if(no[i].produto.getNomeProduto().contains(s)) {
                return no[i];
            } 
        }
        return null;    
    }
    //--------------------------------------------------------------------------
    @Override
    public No remove() {      
        if(this.ultimo == 0) {
            System.out.println("A lista está vazia!!!");
            return null;
        } 
        No newNo = no[prim];
        prim = (prim + 1) % no.length;
        System.out.println("Item removido com sucesso!!!");
        return newNo;
        
    }
    //--------------------------------------------------------------------------
    @Override
    public void imprimeLista() {
        for (int i = this.prim; i <= this.ultimo; i++) {
            System.out.println(i + " - " + no[i]);
        }
    }
    //--------------------------------------------------------------------------
    public double calcularTotal()  {
        for (int i = this.prim; i < this.ultimo; i++) {
            Produto produto = no[i].produto;
            calcularTotal += produto.getValor() * produto.getQuantidade();   
        }
        return this.calcularTotal;
    }    
    //--------------------------------------------------------------------------
}
