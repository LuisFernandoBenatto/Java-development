package Exercicio_8;
/*
Crie um algoritmo que armazene dados de várias contas bancárias em 
uma lista utilizando um vetor, sabendo que uma conta é composta das 
seguintes informações: nomeTitular, numeroConta, numeroAgencia, saldoConta. 
Crie um método para cadastrar os dados de uma conta, um método para buscar 
uma conta a partir do nome do titular e outros dois métodos para depositar 
e retirar dinheiro destas contas-correntes.
*/
public class ContasBancarias {
    private String nomeTitular;
    private int numeroConta;
    private int numeroAgencia;
    private double saldoConta;
    
    public ContasBancarias() {
        this.nomeTitular = "";
        this.numeroAgencia = 0;
        this.numeroConta = 0;
        this.saldoConta = 0.0;
    }
    public ContasBancarias(String nomeTitular, int numeroConta, 
                            int numeroAgencia, double saldoConta) {
        this.nomeTitular = nomeTitular;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }
    public String getNomeTitular(){
        return this.nomeTitular;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }
    public int getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public double getSaldoConta(){
        return this.saldoConta;
    }
    
    public void setNomeTitular(String nomeTitular){
       this.nomeTitular= nomeTitular;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setNumeroAgencia(int numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
    public void setSaldoConta(double saldoConta){
        this.saldoConta = saldoConta;
    }
    @Override
    public String toString(){
        return (
        "Nome do titular da conta: " + this.nomeTitular + " - "
        + "Numero da conta: " + this.numeroConta + " - "
        + "Numero da agencia:  " + this.numeroAgencia + " - "
        + "Saldo da conta: " + this.saldoConta
        );
    }
}
