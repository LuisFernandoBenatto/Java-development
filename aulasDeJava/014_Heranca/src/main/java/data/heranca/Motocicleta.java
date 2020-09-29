package data.heranca;

public class Motocicleta extends Veiculos{
    private Integer cilindradas; 
    
    public Motocicleta(){}
    
    public Motocicleta(String marca, Integer ano, Double valor, 
            Integer cilindradas){
       super(marca, ano, valor);
       this.cilindradas = cilindradas;         
    } 
    
    public Integer getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas; 
    }
}
