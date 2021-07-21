package thread;

public class MainConcorrente {

    public static void main(String[] args) throws InterruptedException {
        TarefaConcorrente tarefa1 = new TarefaConcorrente();
        TarefaConcorrente tarefa2 = new TarefaConcorrente();
        tarefa1.start();   // chama método run ( ) inicia nova thread
        tarefa2.start();
        tarefa1.join();
        tarefa2.join();
        System.out.println("Main terminou");
    }
}
