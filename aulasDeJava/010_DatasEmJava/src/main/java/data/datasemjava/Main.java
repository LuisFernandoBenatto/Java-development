package data.datasemjava;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoas = new Pessoa("Maria", LocalDate.of(2007, Month.OCTOBER, 1));
        
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        LocalDate date2 = LocalDate.of(1999, Month.OCTOBER, 1);
        System.out.println(date2);
        System.out.println(date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        
        pessoas.pessoa();
    }
    
}
