package data.interfacedefila;

/**
 * Fila dinâmica
 */
public class DynQueue implements ICharQ {
    private char q[]; // esse array contém a fila
    private int putloc, getloc; // os índices put e get
    
    // Constrói uma fila vazia dado seu tamanho
    public DynQueue(int size) {
        q = new char[size]; //aloca memória para fila
        putloc = getloc = 0;
    }
    
    // Insere um caractere na fila
    @Override
    public void put(char ch) {
        if(putloc == q.length) {
            // aumenta o tamanho da fila
            char t[] = new char[q.length + 2];
            
            // copia elementos para a nova fila
            for(int i = 0; i < q.length; i++) {
                t[i] = q[i];
            }
            q = t;
        }
        q[putloc++] = ch;
    }
    
    // Remove um caractere da fila
    @Override
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty - ");
            return(char)0;
        }
        return q[getloc++];
    }
}
