/*
    3 • Crie classes adequadas para modelar bebidas. Todas as bebidas tem marca
    e nome (exemplo: Skol, Skol Beats). As bebidas alcoólicas devem ter o teor 
    alcoólico (exemplo: 45.8 ). Os refrigerantes devem ter o sabor 
    (exemplo: cola ). Os sucos devem armazenar a fruta (exemplo: abacaxi ).
 */
package Exercicio_3;

public class Bebidas {
    private String Marca;
    private String Nome;

    public Bebidas() {
        this.Marca = "";
        this.Nome = "";
    }

    public Bebidas(String Marca, String Nome) {
        this.Marca = Marca;
        this.Nome = Nome;
    }

    public String getMarca() {
        return Marca;
    }

    public String getNome() {
        return Nome;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }  
}
