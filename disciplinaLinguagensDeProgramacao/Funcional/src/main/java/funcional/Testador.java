package funcional;

public class Testador {
    public static void main(String[] args) {
        Invertedor inv = new Invertedor();
        Integer v[] = {5, 5, 6, 7, 8, 8, 8, 8, 100, 100, 100, 100, 100, 100, 5, 5, 6, 7, 8, 8, 8, 8, 100, 100, 100, 100, 100, 100};
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < v.length; i++) {
            System.out.println(inv.finverter.apply(v[i]));
        }
        System.out.println("Demorou: " + (System.currentTimeMillis() - inicio));

    }    
}
