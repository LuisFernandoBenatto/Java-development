package data.polimorfismo_2;

public class Ave extends Animal {
    private String corPena;
    public Ave() {
        this.setPeso(0.0);
        this.setIdade(0);
        this.setMembros(0);
        this.corPena = "";
    }
    
    public Ave(String corPena, Double Peso, Integer Idade, Integer Membros) {
        super(Peso, Idade, Membros);
        this.corPena = corPena;
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo minhocas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Piando / Cantando");
    }
    public void fazerNinho() {
        System.out.println("Fazendo seu ninho");
    }

    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }   
    @Override
    public String toString() {
        return "Cor da pena: " + this.getCorPena() + " - " +
               "Idade: " + super.getIdade() + " - " +
               "Quantidade de Membros: " + super.getMembros() + " - " +
               "Peso: " + super.getPeso();
    }
}
