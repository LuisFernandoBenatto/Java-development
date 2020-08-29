/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeauau;

/**
 *
 * @author luis_
 */
public class Cachorro {
    String nome;
    String raca;
    
    public void Latir(){
        System.out.println("Au au!!!");
    }
    public void latirRepetido(int contador){
        if(contador < 0){
            System.out.println("Bugou!");
        }
        else if(contador > 100){
            System.out.println("Parametro invalido");
        }
        else{
            for(int i = 0; i < contador; i++){
                Latir();
            }
        }
    }  
    public String verNome(){
        return this.nome;
    }
    public String verRaca(){
        return this.raca;
    }
}
