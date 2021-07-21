package produtor_consumidor;

public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(100);
        Produtor produtor1 = new Produtor(buffer);
        Produtor produtor2 = new Produtor(buffer);
        Consumidor consumidor1 = new Consumidor(buffer);
        produtor1.start();
        produtor2.start();
        consumidor1.start();
    }
}
