package Exercicio_3;

public class BebidasAlcoolicas extends Bebidas{
    private double TeorAlcoolico;

    public BebidasAlcoolicas() {
        this.TeorAlcoolico = 0.0;
        this.setMarca("");
        this.setNome("");
    }

    public BebidasAlcoolicas(double TeorAlcoolico, String Marca, String Nome) {
        super(Marca, Nome);
        this.TeorAlcoolico = TeorAlcoolico;
    }

    public double getTeorAlcoolico() {
        return TeorAlcoolico;
    }

    public void setTeorAlcoolico(double TeorAlcoolico) {
        this.TeorAlcoolico = TeorAlcoolico;
    } 

    @Override
    public String toString() {
        return "Teor Alcoólico: " + this.getTeorAlcoolico() + " || " + 
               "Marca da bebida: " + this.getMarca() + " || " + 
               "Nome da bebida: " + this.getNome();
    } 
}
