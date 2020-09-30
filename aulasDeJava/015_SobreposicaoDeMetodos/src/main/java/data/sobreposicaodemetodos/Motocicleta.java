package data.sobreposicaodemetodos;

public class Motocicleta extends Veiculo{
    private Integer cilindradas; 
    
    public Motocicleta(){}
    
    public Motocicleta(String marca, Integer ano, Double valor, String placa,
            Integer cilindradas){
       super(marca, ano, valor, placa);
       this.cilindradas = cilindradas;         
    } 
    
    public Integer getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas; 
    }
}
