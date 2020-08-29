package contahipotetica_;

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
