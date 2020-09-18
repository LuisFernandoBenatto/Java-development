package data.stringoper;

public class StringOper {
    public static void main(String[] args) {
        //----------------------------------------------------------------------
        String string = new String();
        String string_1 = new String("String!");
        String string_2 = "String 2!";
        String string_3 = string_1;
        
        // Imutabilidade
        string_2 = "Uenp - Universidade Estadual do Norte do Paraná \n";
        System.out.println(string_2);
        
        System.out.println(string_1.toUpperCase());
        System.out.println(string_1.toLowerCase());
        
        string_1 = string_1.toUpperCase();
        System.out.println("\n" + string_1);
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        String diaDaSemana = "terça";
        String outroDia = "quarta";
        
        if(diaDaSemana.equals(outroDia)) {
            System.out.println("\n" + "São Iguais!");
        } else {
            System.out.println("\n" + "São Diferentes!");
        }
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        String string_4 = "";
        String string_5 = "Conteudo";
        
        //2- Verificar se a String está vazia. if (string. isEmpty())
        if(string_4.isEmpty()) {
            System.out.println("\n" + "String Vazia");
        } else {
            System.out.println("\n" + string_4);
        }
        //----------------------------------------------------------------------
        string_5 = string_5.replaceAll("o", "O");
        System.out.println("\n" + string_5);
        
        string_5 = string_5 + " sobre string's";
        System.out.println("\n" + string_5);
        
        //3 - Verificar se a String não possui algum caractere válido. if (string. trim()
        // Eliminar espaços
        System.out.println(string_5.length());
        string_5 = string_5.trim();
        System.out.println(string_5.length());
        
        String dias = "Segunda, Terça, Quarta, Quinta, Sexta";
        dias = dias.replaceAll((","), "");
        String vetor[] = dias.split(",");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        switch(dias) {
            case "Segunda":
            case "Terça":
            case "Quarta":
            case "Quinta":
                System.out.println("Trabalhar!");
                break;
            case "Sexta":
                System.out.println("Beber!");
                break;
        }
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        String string_6 = "Conteudo da string";
        
        System.out.println(string_6.substring(2, 15));
        //----------------------------------------------------------------------
        //----------------------------------------------------------------------
        
        //Converter a primeira letra para maiúscula
        String string_7 = "uNiVeRsIdAdE!";
        string_7 = string_7.toLowerCase();
        String primeira = string_7.substring(0, 1);
        primeira = primeira.toUpperCase();
        String stringFinal = string_7.substring(1);
        
        string_7 = primeira + stringFinal;
        System.out.println("\n" + string_7);
        
        //Converter a primeira letra para maiúscula
        String palavra = "palavra";
        palavra = palavra.substring(0,1).toUpperCase().concat(palavra.substring(1));
        System.out.println(palavra);
        
        String conteudo = "conteudo";
        System.out.println(capitalize(conteudo));
    }
    public static String capitalize(String str) {
        String valor =  str.substring(0,1).toUpperCase().concat(str.substring(1));       
        return valor;
    }
}
