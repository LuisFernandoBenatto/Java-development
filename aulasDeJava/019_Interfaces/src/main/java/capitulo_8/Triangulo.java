package capitulo_8;

public class Triangulo implements Forma2D, Forma3D {
    private Double base;
    private Double altura;
    
    @Override
    public Double calcularArea() {
        return base * altura;
    }

    public Triangulo() {
        this.altura = 0.0;
        this.base = 0.0;
    }

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Resultado: " + (this.getAltura() * this.getBase());
    }
    
}
