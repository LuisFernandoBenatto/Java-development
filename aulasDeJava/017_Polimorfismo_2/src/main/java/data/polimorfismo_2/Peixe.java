package data.polimorfismo_2;

public class Peixe extends Animal{
    private String corEscama;
    
    public Peixe() {
        this.setPeso(0.0);
        this.setIdade(0);
        this.setMembros(0);
        this.corEscama = "";
    }
    
    public Peixe(String corEscama, Double Peso, Integer Idade, Integer Membros) {
        super(Peso, Idade, Membros);
        this.corEscama = corEscama;
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    public void soltarBolhas(){
        System.out.println("Soltou uma bolha");
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
