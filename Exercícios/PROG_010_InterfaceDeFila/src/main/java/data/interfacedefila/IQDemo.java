package data.interfacedefila;

/**
 *
 * Demonstra a interface ICharQ
 */
public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        
        ICharQ iQ;
        
        char ch;
        int i;
        
        iQ = q1;
        // Insere alguns caracteres na fila fixa
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        // Exibir a fila
        System.out.print("Contents of fixed queue: ");
        for (int j = 0; j < 10; j++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        
        iQ = q2;
        // Insere alguns caracteres na fila dinâmica.
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }
        //Exibir a fila
        System.out.print("Contents of dynamic queue: ");
        for (int j = 0; j < 10; j++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("");
        System.out.println("-----------------------------------------------");
        
        iQ = q3;
           // Insere alguns caracteres na fila circular
        for (i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        //Exibir a fila
        System.out.print("Contents of circular queue: ");
        for (int j = 0; j < 10; j++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("");
        System.out.println("-----------------------------------------------");
        
        // Insere mais caracteres na fila circular
        for (int j = 10; j < 20; j++) {
            iQ.put((char) ('A' + j));
        }
        
        // Exibir a fila
        System.out.print("Contents of circular queue: ");
        for (int j = 0; j < 10; j++) {
            ch = iQ.get();
            System.out.print(ch);
        }
        
        System.out.println("");
        System.out.println("Store and consume from circular queue.");
        System.out.println("");
        
        //Armazena o consumo itens da fila circular
        for (int j = 0; j < 20; j++) {
            iQ.put((char) ('A' + j));
            ch = iQ.get();
            System.out.print(ch);
        }
    }
}
