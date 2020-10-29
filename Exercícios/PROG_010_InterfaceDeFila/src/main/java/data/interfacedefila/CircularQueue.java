package data.interfacedefila;

/**
 Fila circular
 */
public class CircularQueue implements ICharQ {
    private char q[]; // esse array contém a fila
    private int putloc, getloc; // os índices put e get
    
    // Constrói uma fila vazia dado seu tamanho
    public CircularQueue(int size) {
        q = new char[size+1]; // aloca memória a fila
        putloc = getloc = 0;
    }
    
    // Insere um caractere na fila
    @Override
    public void put(char ch) {
        /*
            A fila estará cheia se putloc for uma
        unidade menor do que getloc ou se putloc 
        estiver n fim do array e getloc estiver no 
        ínicio
         */
        if(putloc+1 == getloc | ((putloc == q.length) & (getloc == 0))) {
            System.out.println(" - Queue is full - ");
            return;
        } 
        q[putloc++] = ch;
        if(putloc == q.length) {
            putloc = 0; // retrocode
        }
    }
    
    // Remove um caractere da fila
    @Override
    public char get() {
        if(getloc == putloc) {
            System.out.println(" - Queue is empty - ");
            return (char)0;
        }
        char ch = q[getloc++];
        if(getloc == q.length) {
            getloc = 0; // loop back
        }
        return ch;
    }        
}
