package capitulo_8;

public interface Forma2D {
    public static final String NOME = "Forma 2D";
    
    public abstract Double calcularArea();

    public default Double area() {
        return calcularArea();
    }
    
    @Override
    public String toString();  
}
