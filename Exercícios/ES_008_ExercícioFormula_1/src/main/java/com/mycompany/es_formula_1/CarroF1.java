package com.mycompany.es_formula_1;
/*
Exercício – Introdução a Ponteiros.

Crie uma estrutura de dados (Classe) que armazene os dados de um carro de Formula
1 (CarroF1)
 Os dados a serem armazenados são:
- Equipe (String) [Exemplos: RBR, Mercedes, Mclaren, Williams, Ferrari….]
- Fabricante de Motor (String) [ Honda, Renault, Mercedes, BMW...]
- Pneus (String) [Michellin, Pirelli, Firestone, Goodyear...]
- Cor_predominante(String) [Preto, Vermelho, Amarelo, Rosa, Prata...]
- piloto1 (String)
-piloto2 (String)
- Peso (Float)
Dentro da classe CarroF1, crie:
-Método para imprimir os dados dos carros.
-Método que cadastre as informações dos carros.
*/
public class CarroF1 {
    String _equipe;
    String _fabricanteDeMotor;
    String _pneus;
    String _corPredominante;
    String _piloto1;
    String _piloto2;
    float _peso;
    //--------------------------------------------------------------------------
    public String imprimir() {
        System.out.println("\n*** Carro da Formula 1 ***\n");
        return "Equipe: " + this._equipe + "\n" +
                "Fabricante de Motor: " + this._fabricanteDeMotor + "\n" +
                "Pneus do carro: " + this._pneus + "\n" +
                "Cor predominante do carro: " + this._corPredominante + "\n" +
                "Primeiro Piloto: " + this._piloto1 + "\n" + 
                "Segundo Piloto: " + this._piloto2 + "\n" + 
                "Peso do carro: " + this._peso + "\n";      
    }
    //--------------------------------------------------------------------------
    public void cadastrarCarro(
    String equipe, String fabricanteDeMotor,
    String pneus, String corPredominante,
    String piloto1, String piloto2, float peso) {
        System.out.println("\n**** Cadastrando Carro ****\n");
        this._equipe = equipe;
        this._fabricanteDeMotor = fabricanteDeMotor;
        this._pneus = pneus;
        this._corPredominante = corPredominante;
        this._piloto1 = piloto1;
        this._piloto2 = piloto2;
        this._peso = peso;
    }
    //--------------------------------------------------------------------------
}

