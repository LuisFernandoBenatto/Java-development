package data.listaestatica;

public class Lista {
    // Obj lista[] = new Obj[n];     
    
    final int N = 10;// Defenir constante
    int ultimo = -1; // Ponteiro de controle da lista   
    
    No lista[] = new No[N];  
    //--------------------------------------------------------------------------
    public void inserir(No n){
        if(ultimo < N) {
            // Tenho espaço...
            ultimo++; // Atualizando o ponteiro
            lista[ultimo] = n; // Insere o elemento na posição
        } else {
            System.out.println("A lista está cheio! Volte amanhã!");
        }
    }
    //--------------------------------------------------------------------------
    public void imprimirLista() {
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("Elemento: " 
                                + (i + 1) 
                                + " - " 
                                + lista[i].toString());
        }
    }
    //--------------------------------------------------------------------------
    public int buscar(String n) {
        System.out.println("BUSCANDO.......");
        for (int i = 0; i <= ultimo; i++) {
            if(lista[i].getNome().contains(n)) {
                return i;
            } else {
                //System.out.println((i + 1) + " - " + " Nome diferente!");
            }
        }
        return -1;
    }
    //--------------------------------------------------------------------------
    public No remover(String remover) {
        System.out.println("REMOVENDO......");
        int r = buscar(remover);
        No removedor = null;
        if(r != -1) {
            removedor = lista[r];
            for (int i = r; i < ultimo; i++) {
                lista[i] = lista[i + 1];
            }
            lista[ultimo] = null; // Apagando a ultima posição da lista
            ultimo--;// Atualizando o ponteiro 'ultimo'
        }
        return removedor;
    }
    //--------------------------------------------------------------------------
    public No getElement(int i) {
        if(i <=ultimo) {
            return lista[i];
        }else {
            return null;
        }
    }
    //--------------------------------------------------------------------------
}
