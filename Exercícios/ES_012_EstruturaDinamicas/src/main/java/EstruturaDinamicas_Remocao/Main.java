/**
 * Estrutura de Dados Dinâmica ->
 * Estrutura que aloca recursos de memória 
 * conforme há necessidade de inclusão de novos 
 * elementos
 * 
 * Ponteiros são fundamentais para manipular
 * estas estruturas
 * 
 * Estrutura estática: 
 * - Vetor com tamanho pré-definido
 * - Poucos ponteiros somente para indicar
 * o inicio ou fim da estrutura
  1   2  3  4   5
  • | • | • | • | •
  inicio          fim
 * 
 * Ponteiros eram definidos como inteiros,
 * pois representam um índice no vetor
 * 
 * Estrutura Dinâmicas:
 * 
 * NÓ -> |A| -> |B| -> |C| -> |D| ->  |F|fim
 * 
 * Em Estrutura dinâmica os ponteiros são
 * representações dos endereços e memória dos 
 * objetos que fazem parte da estrutura de dados
 * 
 */
package EstruturaDinamicas_Remocao;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        No n = new No("A", 1);
        lista.inserir(n);
        n = new No("B", 2);
        lista.inserir(n);
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        
        n = new No("C", 3);
        lista.inserir(n);
        n = new No("D", 4);
        lista.inserir(n);
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        
        System.out.println("Buscando.....");
        No buscado = lista.buscar("C");
        System.out.println(buscado.toString());
        System.out.println("-----------------------------------------------");
        
        System.out.println("Removendo......");
        /*
        No removido = lista.remover("A");
        System.out.println("1 -  remoção: " + removido.toString());
        System.out.println("********************");
        removido = lista.remover("D");
        System.out.println("2 -  remoção: " + removido.toString());
        System.out.println("********************");
        */
        No removido = lista.remover("B");
        System.out.println("Remoção: " + removido.toString());
        System.out.println("********************");
        /*
        removido = lista.remover("C");
        System.out.println("4 -  remoção: " + removido.toString());
        */
        removido = lista.remover("Z");
        System.out.println("-----------------------------------------------");
        
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        
        System.out.println("Inserirndo novos elementos............");
        
        lista.inserir(new No("E", 5));
        lista.inserir(new No("F", 6));
        lista.inserir(new No("G", 7));
        lista.inserir(new No("H", 8));
        lista.inserir(new No("I", 9));
        lista.inserir(new No("J", 10));
        System.out.println("-----------------------------------------------");
        lista.imprimirLista();
        System.out.println("-----------------------------------------------");
        
        System.out.println("Removendo outros elementos...........");
        lista.remover("C");
        lista.remover("D");
        lista.remover("E");
        lista.remover("H");
        lista.remover("J");
        System.out.println("-----------------------------------------------");
        
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++" + 
                "+++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.imprimirLista();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++" + 
                "+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Removendo outros elementos...........");
        lista.remover("F");
        lista.remover("G");
        lista.remover("I");
        lista.remover("A");
        System.out.println("-----------------------------------------------");
        
        System.out.println("");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++" + 
                "+++++++++++++++++++++++++++++++++++++++++++++++++");
        lista.imprimirLista();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++" + 
                "+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("");
    }
}
/** LISTA ENCADEADA DINÂMICA
 * 
 *  Criar / alocar espaços em memória de forma
 * dinâmica (em tempo de execução);
 *  Os elementos da lista estarão conectados 
 * (encadeados) por meio de ponteiros;
 * 
 * Ponteiros: Inicio e Fim
 * De valor Null inicialmente
 */
