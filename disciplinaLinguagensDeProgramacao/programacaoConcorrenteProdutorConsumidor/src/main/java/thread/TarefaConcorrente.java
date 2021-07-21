package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TarefaConcorrente extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Sou a tarefa " + this.getName());
        }
    }
}
