package Exercicio_8;

public class Main {
    public static void main(String[] args) {
        ContasBancarias contasBancarias[] = new ContasBancarias[9];
        int ponteiro = -1;
        //----------------------------------------------------------------------
        String[] nomes = new String[] {
          "Pedro", "Bruna", "Naomi",
          "Maria", "Karem", "Tiago",
          "Mario", "Julia", "Bruno" 
        };
        int[] numeroDaConta = new int[] {
          60123, 57654, 46321,
          32679, 25688, 11999,
          92134, 84322, 77021
        };
        int[] numeroDaAgencia = new int[] {
          654, 543, 432,
          321, 210, 654,
          765, 876, 987
        };
        //----------------------------------------------------------------------
        for (int i = 0; i < contasBancarias.length; i++) {
            ponteiro = criandoConta(contasBancarias,
                                    nomes[i], numeroDaConta[i],
                                    numeroDaAgencia[i], 0.0, 
                                    ponteiro);
        }
        //----------------------------------------------------------------------
        System.out.println("Contas Bancarias: ");
        for (int i = 0; i <= ponteiro; i++) {
            System.out.println(contasBancarias[i].toString());
        }
        System.out.println(""); 
        //----------------------------------------------------------------------
        System.out.println("Depositando...");
        for (int i = 0; i <= ponteiro; i++) {
            deposito(contasBancarias,
                    nomes[i],numeroDaConta[i],
                    numeroDaAgencia[i], ((i+1)*5000), 
                    ponteiro);
        }
        //----------------------------------------------------------------------
        System.out.println("Contas Bancarias: ");
        for (int i = 0; i <= ponteiro; i++) {
            System.out.println(contasBancarias[i].toString());
        }
        System.out.println(""); 
        //----------------------------------------------------------------------
        System.out.println("Sacando dinheiro....");
        for (int i = 0; i <= ponteiro; i++) {
            saque(contasBancarias,
                   nomes[i],numeroDaConta[i],
                   numeroDaAgencia[i], ((i+1)*200), 
                   ponteiro);
        }
        //----------------------------------------------------------------------
        System.out.println("Contas Bancarias: ");
        for (int i = 0; i <= ponteiro; i++) {
            System.out.println(contasBancarias[i].toString());
        }
        System.out.println(""); 
        //----------------------------------------------------------------------
    }
    //--------------------------------------------------------------------------
    public static int criandoConta(
        ContasBancarias vetor[],
        String nome,int numeroDaConta,
        int numeroDaAgencia,
        double saldo, int ponteiro) {
        
        if (ponteiro >= vetor.length) {
            System.out.println("Erro: Ponteiro maior que a lista!");
        }else {
            ponteiro++;
            ContasBancarias contasBancarias = new ContasBancarias(
                    nome, numeroDaConta,
                    numeroDaAgencia, saldo);
            vetor[ponteiro] = contasBancarias;
        }        
        return ponteiro;
    }
    //--------------------------------------------------------------------------
    public static void deposito(
        ContasBancarias vetor[],
        String nome, int numeroDaConta,
        int numeroDaAgencia, double dinheiro,
        int ponteiro) {
        
        int index = buscaPorNome(vetor, nome, ponteiro);
        if(index == -1) {
            System.out.println("Conta não encontrada");
        } else {
            ContasBancarias contasBancarias = vetor[index];
            if(contasBancarias.getNumeroConta() == numeroDaConta && 
                    contasBancarias.getNumeroAgencia()== numeroDaAgencia) {
                double saldoAtual = contasBancarias.getSaldoConta();
                contasBancarias.setSaldoConta(saldoAtual + dinheiro);
            }
        }
    }
    //--------------------------------------------------------------------------
    public static void saque(
        ContasBancarias vetor[],
        String nome, int numeroDaConta,
        int numeroDaAgencia, double dinheiro,
        int ponteiro) {
        
        int index = buscaPorNome(vetor, nome, ponteiro);
        if(index == -1) {
            System.out.println("Conta não encontrada");
        }else {
            ContasBancarias contasBancarias = vetor[index];
            if(contasBancarias.getNumeroConta() == numeroDaConta && 
                    contasBancarias.getNumeroAgencia()== numeroDaAgencia) {
                double saldoAtual = contasBancarias.getSaldoConta();
                contasBancarias.setSaldoConta(saldoAtual - dinheiro);
            }
        }
    }
    //--------------------------------------------------------------------------
    public static int buscaPorNome(
        ContasBancarias vetor[],
        String nome, int ponteiro) {
        
        for (int i = 0; i <= ponteiro; i++) {
            if(vetor[i].getNomeTitular() == nome){
                return i;
            }
        }
        return -1;
    }
    //-------------------------------------------------------------------------- 
}
