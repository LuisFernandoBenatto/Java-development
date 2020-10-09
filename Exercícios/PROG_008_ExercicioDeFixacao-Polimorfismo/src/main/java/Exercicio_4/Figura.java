/*
    4 • Crie a classe abstrata Figura, com o método abstrato calcularArea( ) e 
    os atributos  concretos dim1 e dim2 (dimensões). Crie duas classes concretas
    que herdem de Figura: Retangulo e Triangulo. Implemente o cálculo de área 
    adequado para cada uma delas. Em uma classe de teste, crie objetos das 
    classes Retangulo e Triangulo usando referências de Figura. Mostre como 
    chamar polimorficamente o método concreto calcularArea( ).
 */
package Exercicio_4;

public abstract class Figura {
    public double Dimensao_1;
    public double Dimensao_2;
       
    abstract public double calcularArea();

    public Figura() {
        this.Dimensao_1 = 0.0;
        this.Dimensao_2 = 0.0;
    }

    public Figura(double Dimensao_1, double Dimensao_2) {
        this.Dimensao_1 = Dimensao_1;
        this.Dimensao_2 = Dimensao_2;
    }

    public double getDimensao_1() {
        return Dimensao_1;
    }

    public double getDimensao_2() {
        return Dimensao_2;
    }

    public void setDimensao_1(double Dimensao_1) {
        this.Dimensao_1 = Dimensao_1;
    }

    public void setDimensao_2(double Dimensao_2) {
        this.Dimensao_2 = Dimensao_2;
    }
}
