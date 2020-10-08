package data.provadeestruturadedados;

public class ListaEstatica {
    private int TAMANHO;
    public Produtos produtos[];
    private int ponteiro;

    public ListaEstatica (int tamanho) {
        this.TAMANHO = tamanho;
        this.produtos = new Produtos[this.TAMANHO];
        this.ponteiro = 0;
    }

    public void imprimirLista() {
      for (int i = 0; i < this.ponteiro; i++) {
        System.out.println(produtos[i].toString());
      }
    }

    public Produtos remover(int remover) {
      if (remover < 0 || remover > this.ponteiro){
        System.out.println("Lista está vazia");
      }
      else{
        for (int i = remover; i <= this.ponteiro; i++){
          if (i< (produtos.length)-1){
            produtos[i] = produtos[i+1];
          }
        }
        System.out.println("Removendo!!!!!");
        this.ponteiro -= 1;
        return produtos[remover];
      }
      return null;
    }

    public void inserir(Produtos produto) {
      if (this.ponteiro > produtos.length){
        System.out.println("A lista já está cheia");
      }
      else {
        System.out.println("Produto inserido com sucesso!!!!");
        produtos[this.ponteiro] = produto;
        this.ponteiro += 1;
      }
  } 
}
