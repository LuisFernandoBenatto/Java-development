/*Escreva uma classe Paciente que tem um nome(texto) e um código (inteiro).
Escreva a classe Consulta, que tem uma data e um Paciente. Todos os atributos
devem ser privados e devem ter métodos públicos de leitura e escrita (get e set). Na
classe Main, mostre como manter uma lista de consultas utilizando um objeto da
classe ArrayList.
Mostre como:
- adicionar consultas
- listar todas as consultas
- alterar uma determinada consulta
- remover uma consulta
- limpar a lista*/
package data.listadepacientes;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Exemplo de LocalDate
        
        // Criando um objeto com a data atual do sistema
        LocalDate ld = LocalDate.now();
        System.out.println(ld); // mostra no padrão yyyy-MM-dd
        //Para formatar uma data
        System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        // Para criar uma data específica 
        LocalDate umaData = LocalDate.of(2020, Month.SEPTEMBER, 1); 
        // ou 
        LocalDate outraData = LocalDate.of(2020, 9, 20); 
       
        
        
        // Exemplo de arrays de objetos
        Pessoa pessoas[] = new Pessoa[3];
        pessoas[0] = new Pessoa("Bob Esponja", LocalDate.of(1980, Month.APRIL, 1)); 
        pessoas[1] = new Pessoa("Patrick", LocalDate.of(1990, Month.APRIL, 10));
        pessoas[2] = new Pessoa("Lula Molusco", LocalDate.of(1960, Month.DECEMBER, 15));
        
        
        for(int i=0; i<pessoas.length; i++){
            Pessoa p = pessoas[i];
            System.out.println(p.getNome());
        }    
    }
    
}
