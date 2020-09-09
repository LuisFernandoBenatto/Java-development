package arraydeobjetos;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        int v[] = new int[10];
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        
        Pessoa pessoas[] = new Pessoa[10]; 
        
        pessoas[0] = new Pessoa("Bob Esponja", LocalDate.of(1980, Month.APRIL, 1));
        pessoas[1] = new Pessoa("Patric", LocalDate.of(1990, Month.SEPTEMBER, 25));
        pessoas[2] = new Pessoa("Senhor Sirigueijo", LocalDate.of(1960, Month.JANUARY, 18));
        pessoas[3] = new Pessoa("Lula mosluco", LocalDate.of(1970, Month.NOVEMBER, 9));
        pessoas[4] = new Pessoa("Gary", LocalDate.of(1999, Month.DECEMBER, 30));
        pessoas[5] = new Pessoa("Bob Esponja", LocalDate.of(1980, Month.APRIL, 1));
        pessoas[6] = new Pessoa("Patric", LocalDate.of(1990, Month.SEPTEMBER, 25));
        pessoas[7] = new Pessoa("Senhor Sirigueijo", LocalDate.of(1960, Month.JANUARY, 18));
        pessoas[8] = new Pessoa("Lula mosluco", LocalDate.of(1970, Month.NOVEMBER, 9));
        pessoas[9] = new Pessoa("Gary", LocalDate.of(1999, Month.DECEMBER, 30));

        
        for (int i = 0; i < pessoas.length; i++) {
            Pessoa p = pessoas[i];
            System.out.println(p.getNome());
        }
    }
    
}
