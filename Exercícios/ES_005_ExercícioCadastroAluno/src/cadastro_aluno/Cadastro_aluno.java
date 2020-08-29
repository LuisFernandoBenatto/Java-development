package cadastro_aluno;
import java.util.Scanner;

public class Cadastro_aluno {

    static Scanner tec = new Scanner(System.in);
    static Aluno vetAl[] = new Aluno[3];
    public static void main(String[] args) {
        // instancia o Scanner para possibilitar a leitura via teclado...                
        System.out.println("====CADASTRO DE ALUNOS======");
        int cont =0;
        int opcao=-1;
        while(opcao!=0){            
            
            System.out.println("Digite a opção desejada ");
            System.out.println(" 1 - Cadastrar ");
            System.out.println(" 2 - Buscar ");
            System.out.println(" 3 - remover ");
            System.out.println(" 4 - imprimir ");
            System.out.println(" 0 - Sair ");
            try{
                opcao = tec.nextInt();
                tec.nextLine();
            }
            catch (Exception ex){
                System.out.println("Erro "+ex.getMessage());
                tec.nextLine();
            }
            switch (opcao){                
                case 1: if (cont < (vetAl.length)){
                            vetAl[cont] = new Aluno();
                            vetAl[cont].cadastra();
                            cont = cont+1;
                        }
                        else{
                            System.out.println("Vetor cheio...");
                        }
                        break;
                case 2: System.out.println("Digite um nome para buscar:");
                        String busca = tec.nextLine();
                        System.out.println("Posição : "+busca(busca));
                        break;
                case 3: System.out.println("Remover...");
                        System.out.println("Digite um nome para remover:");
                        String remover = tec.nextLine();
                        if (remover(remover))
                            cont = cont-1;                        
                        break;
                case 4: //Imprime o nome dos alunos limitado ao contador.
                        for (int i = 0; i < cont; i++) {
                            System.out.println(vetAl[i].toString());            
                        }
                        break;                            
            }
        }
                       
    }
    public static int busca(String busca){        
        for (int i = 0; i < vetAl.length; i++) {
            if(vetAl[i].nome.contains(busca)){
                return i;
            }            
        }
        return -1;
    }
    public static boolean remover(String rem){
        int r = busca(rem);
        if(r!=-1){
        //deslocar os elementos em um vetor... para uma posição anterior... 
            for (int i = r; i < (vetAl.length-1); i++) {
                vetAl[i] = vetAl[i+1];
            }
            System.out.println("Removido com sucesso!");
            return true;
        }
        else{
            System.out.println("Falha ao remover");
            return false;                
        }      
    }   
}
