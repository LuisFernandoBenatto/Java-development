package vetores_objetos_java;
import java.util.Random;
import java.util.Scanner;
/*
import java.util.Random;
Random random = new Random();
*/
public class Vetores_Objetos_Java {
    
    static Scanner scanf = new Scanner(System.in);
    static Random random = new Random();
    static int vet_n[] = new int[20];
    static int vet_n2[] = new int[20];
    //int numero = random. nextInt(100);
    public static void main(String[] args) {
       
        int op = -1;
        
        while(op != 0){           
            System.out.println(" >> Digite a opção desejada! << ");
            System.out.println(" >> 1 << - Preencher vetor automaticamente");
            System.out.println(" >> 2 << - Imprimir vetor");
            System.out.println(" >> 3 << - Trocando os valores do vetor de posição");
            System.out.println(" >> 4 << - Buscar valor do vetor");
            System.out.println(" >> 5 << - Apagar valor do vetor");
            System.out.println(" >> 0 << - Sair");
            try{
                System.out.print("Opção: ");
                op = scanf.nextInt();
                scanf.nextLine();
            }
            catch (Exception ex){
                System.out.println("Erro: " + ex.getMessage());
                scanf.nextLine();
            }
            switch(op){
                case 1:
                    Preencher_vetor();
                    System.out.println("Vetor preenchido!");
                    System.out.println("");
                    break;
                case 2:
                    Imprimir_vetor(vet_n);   
                    break;
                case 3:
                    System.out.println("Vamos trocar os valores de posição!");
                    System.out.println("Valores do vetor atuais: ");
                    Imprimir_vetor(vet_n);
                    Invertendo_vetor();
                    System.out.println("Valores do depois da troca: ");
                    Imprimir_vetor(vet_n2); 
                    break;
                case 4:
                    int valor_buscar;
                    System.out.print("Informe o valor que pretende buscar: ");
                    valor_buscar = scanf.nextInt();
                    System.out.println("Valor encontrado na posição: " + Buscar(valor_buscar));
                    break;
                case 5:
                    int valor_remover;
                    System.out.print("Informe o valor que pretende remover: ");
                    valor_remover = scanf.nextInt();
                    System.out.println("Valor a ser removido = "+ Remover(valor_remover));
                    break;
                case 0:
                    System.out.println("Até mais!!!");
                    break;
                default:
                    System.out.println("Opção não existente, por favor informe outra opção");
                    break;                                               
            }
        }
    }
/******************************************************************************/
    public static void Preencher_vetor(){
        for (int i = 0; i < vet_n.length; i++){
            vet_n[i] = random.nextInt(20);
        }
    }
/******************************************************************************/
    public static void Imprimir_vetor(int vet[]){
        for (int i = 0; i < vet.length; i++){
            System.out.print(vet[i] + "| ");
        }
        System.out.println("\n");
    }  
/******************************************************************************/
    public static int Buscar(int valor_n){
        for (int i = 0; i < vet_n.length; i++) {
            if(vet_n[i] == valor_n){
               return i; 
            }           
        }
        return -1;
    }  
/******************************************************************************/
    public static boolean Remover(int valor_n){
        int r = Buscar(valor_n);
        if (r == -1){
            return false;
        }
        for (int i = r; i < (vet_n.length)- 1; i++){
            if (i < (vet_n.length)-1){
                vet_n[i] = vet_n[i + 1];
            }     
            if (i + 1 == vet_n.length){
                vet_n[i] = 0;
            }
        }
        return true;
    }
/******************************************************************************/
    public static void Invertendo_vetor(){
        for (int i = 0; i < vet_n.length; i++){
            vet_n2[(vet_n.length - 1) - i] = vet_n[i];
        }
    }
/******************************************************************************/
}
/******************************************************************************/       

        
  

