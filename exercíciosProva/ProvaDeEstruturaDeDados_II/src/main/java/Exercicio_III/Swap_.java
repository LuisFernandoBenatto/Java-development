package Exercicio_III;

public class Swap_ {
    int key;
    
    void swap(No n1, No n2) {
        if (n1 == n2)
            return;
        if (n1.proximo == n2) { 
            n1.proximo = n2.proximo;
            n2.anterior = n1.anterior;
        if (n1.proximo != null)
            n1.proximo.anterior = n1;
        if (n2.anterior != null)
            n2.anterior.proximo = n2;
        n2.proximo = n1;
        n1.anterior = n2;
        } else {
            No a = n2.anterior;
            No b = n2.proximo;

            n2.anterior = n1.anterior;
            n2.proximo = n1.proximo;

            n1.anterior = a;
            n1.proximo = b;

            if (n2.proximo != null)
                n2.proximo.anterior = n2;
            if (n2.anterior != null)
                n2.anterior.proximo = n2;

            if (n1.proximo != null)
                n1.proximo.anterior = n1;
            if (n1.anterior != null)
                n1.anterior.proximo = n1;
        }
    }
}
