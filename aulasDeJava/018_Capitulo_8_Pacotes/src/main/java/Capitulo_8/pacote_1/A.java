package Capitulo_8.pacote_1;

import java.time.LocalDate;
import java.util.Date;

public class A {
    LocalDate localData;
    Date data;
    
    java.util.Date data_1;
    java.sql.Date data_2;
    //--------------------------------------------------------------------------
    //java.lang.*;
    
    String s;
    Double d;
    Integer i;
    
    //--------------------------------------------------------------------------
    /* Método protegido
        Só pode ser acessado por
        classes do mesmo pacote
    */
    protected void show() {
        System.out.println("Hello, World");
    }
    //--------------------------------------------------------------------------
}
