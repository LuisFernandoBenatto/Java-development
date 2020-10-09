package Exercicio_3;

public class SucoDeFruta extends Bebidas {
    private String Fruta;

    public SucoDeFruta() {
        this.Fruta = "";
        this.setMarca("");
        this.setNome("");
    }

    public SucoDeFruta(String Fruta, String Marca, String Nome) {
        super(Marca, Nome);
        this.Fruta = Fruta;
    }

    public String getFruta() {
        return Fruta;
    }

    public void setFruta(String Fruta) {
        this.Fruta = Fruta;
    }
        @Override
    public String toString() {
        return "Fruta do suco: " + this.getFruta() + " || " + 
               "Marca da bebida: " + this.getMarca() + " || " + 
               "Nome da bebida: " + this.getNome();
    }  
}
