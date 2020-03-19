/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contahipotetica_;

/**
 *
 * @author luis_
 */
public class Conta {
    int numeroCliente;
    String nomeCliente;
    float saldoCliente;
    
    Conta(){
        numeroCliente = 0;
        nomeCliente = "";
        saldoCliente = 0.0f;
    }
    float Depositar(float valor){
        saldoCliente += valor;
        return saldoCliente;
    }
    float Retirar(float valor){
        saldoCliente -= valor;
        return saldoCliente;
    }
}
