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
