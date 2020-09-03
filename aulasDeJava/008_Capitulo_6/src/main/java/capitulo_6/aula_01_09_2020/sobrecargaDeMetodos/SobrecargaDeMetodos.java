package capitulo_6.aula_01_09_2020.sobrecargaDeMetodos;

public class SobrecargaDeMetodos {
    
    public int somar(int x){
        return x;
    }
    public int somar(int x, int y){
        return x + y;
    }
    public int somar(int x, int y, int z){
        return x + y + z;
    }
    
    public void imprimir(int x, int y){
        System.out.println("Valor de x: " + x + " - " +
                           "Valor de y: " + y);
        if(x == y) {
            System.out.println("Valores iguais!" + "\n");
        } else if (x > y) {
            System.out.println("Valor de x: " + x +
                    " é maior que o valor de y: " + y + "\n");
        } else {
            System.out.println("Valor de y: " + y +
                    " é maior que o valor de x: " + x + "\n");
        }
    } 
    public void imprimir(int x, String texto){
        for (int i = 0; i < x; i++) {
            System.out.println((i+1) + " : " + texto);      
        }   
        System.out.println("\n");
    }
    public void imprimir(int x, int y, String texto){
        System.out.println("Valor de x: " + x + " - " +
                            texto + " - " +
                           "Valor de y: " + y + "\n");
    } 
}
