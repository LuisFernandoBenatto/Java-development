package data;

public class Principal {
    public static void main(String[] args) {
       Duplas<String, String> duplas = new Duplas("Bruno", "Marone");
       
       Cidade cidade = new Cidade("Fenda do Biquini");
       Prefeito prefeito = new Prefeito("Bob Esponja");
       
       Duplas<Cidade, Prefeito> d = new Duplas(cidade, prefeito);
       Duplas<Integer, Double> duplas_2 = new Duplas(9123456, 13123.547);
    }
}
