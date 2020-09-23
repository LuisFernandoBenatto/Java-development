/*
2
Crie um método static chamado mostrar( ) 
que tenha uma quantidade variável de 
argumentos (varargs) do tipo String. 
O método deve exibir as strings 
(System.out.println( )) e depois retornar 
a quantidade de strings exibidas.
*/
package Questao_2;

public class Main {
    public static void main(String[] args) {
       System.out.println("Contador: " + mostrar("Gabriel","Samuel",
                                                 "Daniel", "Miguel", 
                                                 "Hariel", "Emanuel"));
    }
    public static int mostrar(String ...string) {
        int contador = 0;
        for(String x: string){
            System.out.println(x);
            contador++;
            //System.out.println(contador);
        }
        return contador;
    }
}
