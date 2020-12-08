package data;

public class Principal {
    public static void main(String[] args) {
       Duplas<String, String> duplas = new Duplas("Bruno", "Marone");
       
       Cidade cidade = new Cidade("Fenda do Biquini");
       Prefeito prefeito = new Prefeito("Bob Esponja");
       
       Duplas<Cidade, Prefeito> d = new Duplas(cidade, prefeito);
       Duplas<Integer, Double> duplas_2 = new Duplas(9123456, 13123.547);
   
       Integer[] inteiros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
       System.out.println(Util.somaElementos(inteiros));
    }
}
