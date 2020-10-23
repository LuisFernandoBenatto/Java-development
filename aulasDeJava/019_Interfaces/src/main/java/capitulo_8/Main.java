package capitulo_8;

public class Main {
    public static void main(String[] args) {
        Forma2D f = new Triangulo(10.0, 10.0);
        f.calcularArea();
        f.toString();
        
        System.out.println(Util.getAno());
        
        Triangulo t = new Triangulo(20.99, 30.7);
        t.area();
    }
}
