package data.polimorfismo_2;

public class Reptil extends Animal {
    private String corEscama;
    
    public Reptil() {
        this.setPeso(0.0);
        this.setIdade(0);
        this.setMembros(0);
        this.corEscama = "";
    }
    
    public Reptil(String corEscama, Double Peso, Integer Idade, Integer Membros) {
        super(Peso, Idade, Membros);
        this.corEscama = corEscama;
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Come Vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    @Override
    public String toString() {
        return "Cor da Escama: " + this.getCorEscama() + " - " +
               "Idade: " + super.getIdade() + " - " +
               "Quantidade de Membros: " + super.getMembros() + " - " +
               "Peso: " + super.getPeso();
    }
}
