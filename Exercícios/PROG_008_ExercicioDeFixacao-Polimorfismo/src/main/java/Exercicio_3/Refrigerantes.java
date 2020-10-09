package Exercicio_3;

public class Refrigerantes extends Bebidas {
    private String Sabor;

    public Refrigerantes() {
        this.Sabor = "";
        this.setMarca("");
        this.setNome("");
    }

    public Refrigerantes(String Sabor, String Marca, String Nome) {
        super(Marca, Nome);
        this.Sabor = Sabor;
    }

    public String getSabor() {
        return Sabor;
    }

    public void setSabor(String Sabor) {
        this.Sabor = Sabor;
    } 
    @Override
    public String toString() {
        return "Sabor do refrigerante: " + this.getSabor() + " || " + 
               "Marca da bebida: " + this.getMarca() + " || " + 
               "Nome da bebida: " + this.getNome();
    } 
}
