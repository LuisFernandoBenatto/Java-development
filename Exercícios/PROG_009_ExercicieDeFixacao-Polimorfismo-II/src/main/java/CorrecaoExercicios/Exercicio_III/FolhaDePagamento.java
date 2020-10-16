package CorrecaoExercicios.Exercicio_III;

import java.util.ArrayList;

public class FolhaDePagamento {
    ArrayList<Funcionario> lista;

    public FolhaDePagamento() {
        this.lista = new ArrayList();
    }
    
    public FolhaDePagamento(Funcionario[] funcionarios) {
        this.lista = new ArrayList();
        for (Funcionario funcionario : funcionarios) {
            this.lista.add(funcionario);
        }
    }
    public void imprimir(){
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.toString());
        }
    }
    public void adicionar(Funcionario funcionario){
        this.lista.add(funcionario);
    }
}