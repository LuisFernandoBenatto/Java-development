package thread;

public class MainSequencial {
    public static void main(String[] args) {
        TarefaSequencial tarefa1 = new TarefaSequencial(" 1");
        TarefaSequencial tarefa2 = new TarefaSequencial(" 2");
        tarefa1.run();
        tarefa2.run();
        System.out.println("Main terminou");
    }
}
