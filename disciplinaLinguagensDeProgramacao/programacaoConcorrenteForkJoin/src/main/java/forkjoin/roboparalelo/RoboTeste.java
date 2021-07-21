package forkjoin.roboparalelo;

import java.util.concurrent.ForkJoinPool;

public class RoboTeste {

    public static void main(String[] args) {
        // Robo convencional
        long inicio = System.currentTimeMillis();
        System.out.println("Caminhos (10, 10): " + (Robo.contar(10, 10)));
        System.out.println("Robô convencional: " + (System.currentTimeMillis() - inicio));

//        // Robo paralelo
//        inicio = System.currentTimeMillis();
//        RoboParalelo conta = new RoboParalelo(10, 10, false);
//        long total = conta.compute();
////        System.out.println(total);
//        System.out.println("Robô paralelo....: " + (System.currentTimeMillis() - inicio));

        RoboParalelo rob = new RoboParalelo(10, 10, false);
        inicio = System.currentTimeMillis();
//        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinPool pool = ForkJoinPool.commonPool();
        long soma = pool.invoke(rob);
        //System.out.println("Soma: "+ soma);
        long fim = System.currentTimeMillis();
        System.out.println("Robô paralelo ...: " + (fim - inicio));

    }
}
