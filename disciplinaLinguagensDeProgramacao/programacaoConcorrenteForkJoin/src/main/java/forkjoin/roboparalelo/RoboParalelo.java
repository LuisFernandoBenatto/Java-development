package forkjoin.roboparalelo;

import java.util.concurrent.RecursiveTask;

public class RoboParalelo extends RecursiveTask<Long> {
    long x;
    long y;
    boolean dividido;

    public RoboParalelo(long x, long y, boolean dividido) {
        this.x = x;
        this.y = y;
        this.dividido = dividido;
    }

    @Override
    protected Long compute() {
        //System.out.println(Thread.currentThread().getName());
        if (dividido == true){
            return this.contarCaminhos(x, y);
        }        
        RoboParalelo c1 = new RoboParalelo(x - 1, y, true);
        RoboParalelo c2 = new RoboParalelo(x, y-1, true);
        c1.fork();
        c2.fork();  
        long c1Resultado = c1.join();  
        long c2Resultado = c2.join(); 
        return c1Resultado + c2Resultado;     
    }
    
     public long contarCaminhos(long x, long y) {      
        if (x == 0 || y == 0) return 1L; 
        return (contarCaminhos(x - 1, y) + contarCaminhos(x, y - 1));
    }

//    Se fosse criar subtarefas recursivamente...
//     private Collection<RoboParalelo> criarSubtarefas() {
//        List<RoboParalelo> tarefasDivididas = new ArrayList<>();
//        tarefasDivididas.add(new RoboParalelo(x - 1, y, true));
//        tarefasDivididas.add(new RoboParalelo(x, y - 1, true));
//        return tarefasDivididas;
//    } 
}
