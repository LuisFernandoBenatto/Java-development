/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crie uma classe para a seguinte situação. De um funcionário horista deve-se
guardar o valor por hora e a quantidade de horas trabalhadas. Deve haver uma
operação para calcular (e retornar) o salário a receber, sabendo-se que o valor a
receber é o valor da hora multiplicado pela quantidade de horas.
Instancie um objeto do tipo funcionário horista, atribua um valor para o salário hora,
um valor para horas trabalhadas e chame o método para calcular salário (mostre o
salário calculado)
 */
package funcionariohorista;
import java.util.Scanner;

public class FuncionarioHorista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanf = new Scanner(System.in);
        FuncionarioPorHora funcionario = new FuncionarioPorHora();
        
        int valor = 0;
        System.out.print("Informe o valor da Hora: ");
        funcionario.valorPorHora = scanf.nextInt();
        
        System.out.print("Informe a quantidade de horas trabalhadas: ");
        funcionario.horasTrabalhadas = scanf.nextInt();
               
        funcionario.calculaSalario();     
    }   
}
