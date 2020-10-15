/**
    3 Crie a classe abstrata Funcionario com o método abstrato calcularSalario()
    * cujo retorno seja double. Crie a classe concreta Diarista que herda de 
    * Funcionario. A classe tem os atributos salarioDia e diasTrabalhados. 
    * O método calcularSalario( ) retorna a multiplicação de salarioDia por 
    * diasTrabalhados. Crie a classe Gerente que implementa Funcionario. 
    * A classe tem o atributo salarioMes. O método calcularSalario( ) retorna 
    * o salarioMes mais um bônus de 10%. Crie a classe FolhaPagamento com 
    * uma lista (vetor, List ou ArrayList) do tipo Funcionario com alguns 
    * objetos do tipo Diarista e alguns do tipo Gerente. Mostre a execução 
    * polimórfica de calcularSalario( ) utilizando os objetos desta lista.
 */
package Exercicio_III;

public class Main {
    public static void main(String[] args) {
        Diarista diarista_I = new Diarista(60.0, 22);
        Gerente gerente_I = new Gerente(2589.99);
        
        System.out.println("Salario diarista: " + diarista_I.calcularSalario());
        System.out.println("Salario gerente: " + gerente_I.calcularSalario());
        System.out.println("");
        
        Diarista diarista_II = new Diarista();
        Gerente gerente_II = new Gerente();
        
        diarista_II.setDiasTrabalhados(30);
        diarista_II.setSalarioDia(80);
        gerente_II.setSalarioMes(20_876.25);
        
        
        System.out.println("Salario diarista: " + diarista_II.calcularSalario());
        System.out.println("Salario gerente: " + gerente_II.calcularSalario());
        System.out.println("");
        
        Funcionario diarista_III = new Diarista(75.88, 20);
        Funcionario gerente_III = new Gerente(9999.99);
    
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        folhaDePagamento.adicionar(diarista_I);
        folhaDePagamento.adicionar(diarista_III);
        folhaDePagamento.adicionar(gerente_I);
        folhaDePagamento.adicionar(gerente_III);

        folhaDePagamento.imprimir();

    }
    
}
