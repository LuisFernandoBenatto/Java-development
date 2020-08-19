package construtores;

public class Caixa {
    float largura;
    float altura;
    float comprimento;   
    Caixa(){
        largura = 0.0f;
        altura = 0.0f;
        comprimento = 0.0f;
    }
    Caixa(float largura,float altura,float comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    Caixa(float valor){
        largura = valor;
        altura = valor;
        comprimento = valor;
    }
    public float CalcularVolume(){
        float volume;
        volume = largura * altura * comprimento;
        return volume;
    }
}
