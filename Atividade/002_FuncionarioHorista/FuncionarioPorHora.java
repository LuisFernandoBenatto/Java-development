/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionariohorista;

/**
 *
 * @author luis_
 */
public class FuncionarioPorHora {
    int valorPorHora; // quanto vai ganhar em 1 hora
    int horasTrabalhadas; // 1 hora é igual a 60 minutos
    
    void calculaSalario(){
        int salario = valorPorHora * horasTrabalhadas;
        System.out.println("O salario desse funcionario sera de: " + "R$ " + salario + ",00");
    }     

}
