package arraydeobjetos;

import java.time.LocalDate;
import java.time.Month;

public class Pessoa {
    
    private String _nome;
    private LocalDate _dataDeNascimento;
    
    public Pessoa() {
        _nome = "";
        _dataDeNascimento = LocalDate.of(1, 1, 1);
    }
    
    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this._nome = nome;
        this._dataDeNascimento = dataDeNascimento;
    }
    
    public String getNome(){
        return _nome;
    }
    public void setNome(String nome) {
        this._nome = nome;
    }
    public LocalDate getDataDeNascimento(){
        return _dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this._dataDeNascimento = dataDeNascimento;
    }
}
