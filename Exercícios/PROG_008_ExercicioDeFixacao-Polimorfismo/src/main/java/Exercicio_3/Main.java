package Exercicio_3;

public class Main {
    public static void main(String[] args) {
        BebidasAlcoolicas whisky = new BebidasAlcoolicas
                    (54.86,"Johnnie Walker","Black Label");
        Refrigerantes refrigerante = new Refrigerantes
           ("guaraná", "Guaraná Antartica", "Guaraná Antartica");
        SucoDeFruta suco = new SucoDeFruta
                     ("Laranja", "Vale", "Suco de Laranja Vale");
        
        System.out.println(whisky.toString());
        System.out.println("");
        System.out.println(refrigerante.toString());
        System.out.println("");
        System.out.println(suco.toString());
        System.out.println("");
        
        BebidasAlcoolicas cerveja = new  BebidasAlcoolicas();
        cerveja.setTeorAlcoolico(7.95);
        cerveja.setMarca("Skol");
        cerveja.setNome("Skol Beats");
        
        System.out.println(cerveja.toString());
    }
    
}
