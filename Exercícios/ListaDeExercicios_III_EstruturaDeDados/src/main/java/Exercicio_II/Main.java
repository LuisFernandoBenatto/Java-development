package Exercicio_II;

public class Main {
    public static void main(String[] args) {
        int base = 2;
        int expoente = 10;
        
        ElevandoNumero numero = new ElevandoNumero();
        System.out.println(base + "^" + expoente + " -->> Resultado: " + 
                                               numero.potencia(base, expoente));
                
        base = 5;
        expoente = 5;
        System.out.println(base + "^" + expoente + " -->> Resultado: " + 
                                               numero.potencia(base, expoente));
        
        base = 4;
        expoente = 8;
        System.out.println(base + "^" + expoente + " -->> Resultado: " + 
                                               numero.potencia(base, expoente));
   }   
}