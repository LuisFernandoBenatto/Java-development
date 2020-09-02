package capitulo_6.aula_28_01_2020.a;

public class A {
    public int i;
    private int j;
    String _string;
    
    public A() {
        i = 0;
        j = 0;
        _string = "";
    } 
    
    public void metodoA(){
        System.out.println("Exemplo com métodos!");
    }
    
    public void metodoA_2() {
        System.out.println("Valor de j + i: " + (j+i));    
    }
    
    public void chamarMetodoPrivado() {
        metodoPrivado();
    } 
    
    private void metodoPrivado() {
        System.out.println("Metodo Privado!");
    }
}
