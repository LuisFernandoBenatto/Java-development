package Exercicio_I;

public class Carro extends Veiculos{
    private int QuantPortas;
    private int Ano;

    public Carro(int QuantPortas, int Ano, String Modelo,
                       double Velocidade, int Passageiros, String Combustivel) {
        super(Modelo, Velocidade, Passageiros, Combustivel);
        this.QuantPortas = QuantPortas;
        this.Ano = Ano;
    }  
}
