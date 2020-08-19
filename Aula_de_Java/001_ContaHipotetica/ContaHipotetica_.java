package contahipotetica_;
import java.util.Scanner;

public class ContaHipotetica_ {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Conta conta = new Conta();
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Informe o nome do cliente: ");
        conta.nomeCliente = scanf.nextLine();
        System.out.print("Informe o número do cliente: ");
        conta.numeroCliente = scanf.nextInt();
        
        char movimentarConta = 'd';
        float dinheiro = 0;
        
        while(movimentarConta == 'd' || movimentarConta == 'r'){
            
            movimentarConta = scanf.next().charAt(0);
            
            if(movimentarConta == 'd'){
                System.out.print("Digite o valor a ser depositado: ");
                dinheiro = scanf.nextFloat();
                conta.Depositar(dinheiro);
            }
            if(movimentarConta == 'r'){
                System.out.print("Digite o valor a ser sacado: ");
                dinheiro = scanf.nextFloat();
                conta.Retirar(dinheiro);
                if(conta.saldoCliente < 0){
                    System.out.println("Sua conta esta negativa!");
                }                
            }            
        }       
        System.out.println("O valor total na conta e de: " + conta.saldoCliente);
        scanf.close();
    }
   
}
