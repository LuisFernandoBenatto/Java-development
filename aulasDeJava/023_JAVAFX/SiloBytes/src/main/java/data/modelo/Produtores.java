package data.modelo;

import java.io.Serializable;
import java.time.LocalDate;

public class Produtores implements Serializable{
    private String ID;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate nascimento;
    
    public Produtores () {
        this.ID = "";
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.nascimento = null;
    }
    public Produtores (String ID, String nome, String cpf, LocalDate nascimento, 
            String telefone){
        this.ID = ID;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getID() {
        return ID;
    }
    public String getNomeProdutor() {
        return nome;
    }
    public String getCPF() {
        return cpf;
    }
    public LocalDate getDataNascimento() {
        return nascimento;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public void setID(String ID) {
        this.ID = ID;
    } 
    public void setNomeProdutor(String nome) {
        this.nome = nome;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public void setDataNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
