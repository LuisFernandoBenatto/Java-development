package Exercicio_I;

public class Aviao extends Veiculos{
    private String Uso;
    private String Tipo;

    public Aviao(String Uso, String Tipo, String Modelo, 
                       double Velocidade, int Passageiros, String Combustivel) {
        super(Modelo, Velocidade, Passageiros, Combustivel);
        this.Uso = Uso;
        this.Tipo = Tipo;
    }  
}
