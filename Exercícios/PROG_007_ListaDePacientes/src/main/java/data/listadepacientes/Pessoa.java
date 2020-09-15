package data.listadepacientes;
import java.time.LocalDate;
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento; 
    
    public Pessoa(){
        nome = "";
        dataNascimento = LocalDate.of(1,1,1);
    }
    
    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    } 
}
