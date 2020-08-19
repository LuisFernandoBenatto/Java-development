/*
Crie uma classe chamada Robo, que simula um robô. A classe deve ter um campo,
do tipo texto, com o nome do robô e dois campos do tipo inteiro que indicam
respectivamente os valores de x e y no plano cartesiano (figura). A classe deve ter
um construtor parametrizado que recebe o nome do robô, o valor de x e o valor de y.
Um robô pode andar para direita (x é incrementado), andar para esquerda (x é
decrementado), andar para baixo (y é decrementado) e andar para cima (y é
incrementado). Um robô pode, também, se teletransportar para uma coordenada
específica. Um robô também deve saber informar sua posição (um método que
retorna x e y).
*/
package com.mycompany.robotmoviment;

public class Robo {
    private String _nomeDoRobo;
    private int _x;
    private int _y;
    //--------------------------------------------------------------------------
    Robo(String nomeDoRobo, int x, int y) {
        this._nomeDoRobo = nomeDoRobo;
        this._x = x;
        this._y = y;
    }
    //--------------------------------------------------------------------------
    public void posicaoAtual() {
        System.out.println(
                "Nome do robo: " + Nome() +
                " - " +
                "Posição x: " + posicaoX() +
                " - " +
                " Posição y: " + posicaoY() +
                "\n");
    }
    //--------------------------------------------------------------------------
    public void teletransportar(int x, int y) {
        posicaoXAtual(x);
        posicaoYAtual(y);
    }
    //--------------------------------------------------------------------------
    public void mover(int valor, int direcao) {
        switch(direcao) {
            case 6:
                this._x += valor;
                break;
            case 4:
                this._x -= valor;
                break;
            case 8:
                this._y += valor;
                break;
            case 2: 
                this._y -= valor;
                break;
            default:
                System.out.println("Número 8: para cima, "
                        + "Número 2: para baixo, "
                        + "Número 6: para direita, "
                        + "Número 4: para esquerda. "
                        + "Escolha do valores é por causa do teclado de números"
                        + ", no canto direito do teclado");
                break;
        }
    }
    //--------------------------------------------------------------------------
    public void posicaoXAtual(int x) {
        this._x = x;
    }
    public void posicaoYAtual(int y) {
        this._y = y;
    }
    //--------------------------------------------------------------------------
    public String Nome() {
        return this._nomeDoRobo;
    }
    public int posicaoX() {
        return this._x;
    }
    public int posicaoY() {
        return this._y;
    }
    //--------------------------------------------------------------------------
}
