package data.datasemjava;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    
    private String nome;
    private LocalDate dataDeNascimento;
    
    public Pessoa(String nome, LocalDate data){
        this.nome = nome;
        this.dataDeNascimento = data;     
    }
    
    public void pessoa() {
        System.out.println("Nome: " + this.nome + " - " 
                           + "Data de Nascimento: " + 
                           this.dataDeNascimento + "\n");
    }
    
}
