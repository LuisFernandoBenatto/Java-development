package thread;

public class TarefaSequencial {
    String nome;
    
    public TarefaSequencial(String nome){
        this.nome = nome; 
    }
    
    public void run(){
        for (int i=0; i<4; i++){
            System.out.println("Sou a tarefa "+ this.nome);
        }
    }
}
