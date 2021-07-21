package arq;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class Calculo {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("Calculo Convencional");
        long inicio = System.currentTimeMillis();
        long size = CalculoConvencional.calcular(new File("C:\\Users\\Public\\Downloads\\"));
        long gastou = System.currentTimeMillis() - inicio;
        System.out.println(size / 1024 + " Gastou: " + gastou);
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Calculo Paralelo");
        inicio = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool();
        size = pool.invoke(new CalculoParalelo(new File("C:\\Users\\Public\\Downloads\\")));
        gastou = System.currentTimeMillis() - inicio;
        System.out.println(size / 1024 + " Gastou: "  + gastou);      
        System.out.println("-----------------------------------------------");
    }
}
