package com.mycompany.canhao;
/**
 * @author luis fernando meneghel benatto
 */
public class Main {
    public static void main(String[] args) {
       
        ClassCanhao canhao = new ClassCanhao();
        
        System.out.println(canhao.ajustarAlcance());
        System.out.println(canhao.ajustarAngulo());
        canhao.dispararCanhao();
        
        ClassCanhao canhao_2 = new ClassCanhao(45, 100, 1);
        
        System.out.println(canhao_2.ajustarAlcance());
        System.out.println(canhao_2.ajustarAngulo());
        canhao_2.dispararCanhao();
    }
}
