package data.tiposgenericos;

public class Principal {
    public static void main(String[] args) {
        Dupla dupla = new Dupla("Um", "Dois");
        System.out.println("Dupla_I: " +dupla.primeiro);
        System.out.println("Dupla_II: " + dupla.segundo);
        
        Dupla_<String> s = new Dupla_("Um", "Dois");
        System.out.println("Primeiro: " + s.primeiro + " - " + "Segundo: " + s.segundo);
        Dupla_<Integer> i = new Dupla_(1, 2);
        System.out.println("Primeiro: " + i.primeiro + " - " + "Segundo: " + i.segundo);
        Dupla_<Double> d = new Dupla_(0.351, 0.992);
        System.out.println("Primeiro: " + d.primeiro + " - " + "Segundo: " + d.segundo);
    }  
}
