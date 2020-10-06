package data.polimorfismo_2;

public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero() {
        this.setPeso(0.0);
        this.setIdade(0);
        this.setMembros(0);
        this.corPelo = "";
    }
    
    public Mamifero(String corPelo, Double Peso, Integer Idade, Integer Membros) {
        super(Peso, Idade, Membros);
        this.corPelo = corPelo;
    }
    
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }  

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }  

    @Override
    public String toString() {
        return "Cor do pelo: " + this.getCorPelo() + " - " +
               "Idade: " + super.getIdade() + " - " +
               "Quantidade de Membros: " + super.getMembros() + " - " +
               "Peso: " + super.getPeso();
    }
    
}
