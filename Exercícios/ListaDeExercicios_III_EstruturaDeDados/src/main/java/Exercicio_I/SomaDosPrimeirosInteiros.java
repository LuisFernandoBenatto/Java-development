package Exercicio_I;

public class SomaDosPrimeirosInteiros {
    public int primeirosInteiros(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n + primeirosInteiros(n - 1);
        }
    }   
}