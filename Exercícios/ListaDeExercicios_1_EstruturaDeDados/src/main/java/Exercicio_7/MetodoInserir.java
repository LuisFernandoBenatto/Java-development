package Exercicio_7;

public class MetodoInserir {
    public static void main(String[] args) {
        String vetorString[] = new String[10];  
        int ponteiro = -1;
    
        for (int i = 0; i < 10; i++) {
            ponteiro = inserir(vetorString, "Dados: " + i, ponteiro);
        }
        for (int i = 0; i <= ponteiro; i++) {
            System.out.println(vetorString[i]);
        }
        System.out.println("");
        System.out.println("Valor do ponteiro: " + ponteiro);
    }
    public static int inserir(String vetorString[], String dados, int ponteiro) {
        if(ponteiro >= vetorString.length) {
            System.out.println("Vetor está cheio! Volte amanhã!");
        } else {
            ponteiro++;
            vetorString[ponteiro] = dados;
            System.out.println("Dado inserido com sucesso!!!");
        }
        return ponteiro;
    }
}
