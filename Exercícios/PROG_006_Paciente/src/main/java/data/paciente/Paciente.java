/*
2 Escreva uma classe Paciente que tem um nome(texto) e um código (inteiro). Escreva a
classe Consulta, que tem uma data e um Paciente. Todos os atributos devem ser privados e
devem ter métodos públicos de leitura e escrita (get e set). Na classe Main, mostre como
manter uma lista de consultas. Mostre como acessar os dados de consultas e pacientes
(insira algumas consultas e depois mostre as consultas e respectivos pacientes).
*/
package data.paciente;

public class Paciente {
    private String _nome;
    private int _codigo;
    
    public Paciente() {
        _nome = "";
        _codigo = 0;
    }
    
    public String getNome(){
        return _nome;
    }
    public void setNome(String nome) {
        this._nome = nome;
    }
    public int getCodigo(){
        return _codigo;
    }
    public void setCodigo(int codigo) {
        this._codigo = codigo;
    }
}
