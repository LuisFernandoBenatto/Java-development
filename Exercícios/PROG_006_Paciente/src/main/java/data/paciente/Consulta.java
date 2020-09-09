/*
2 Escreva uma classe Paciente que tem um nome(texto) e um código (inteiro). Escreva a
classe Consulta, que tem uma data e um Paciente. Todos os atributos devem ser privados e
devem ter métodos públicos de leitura e escrita (get e set). Na classe Main, mostre como
manter uma lista de consultas. Mostre como acessar os dados de consultas e pacientes
(insira algumas consultas e depois mostre as consultas e respectivos pacientes).
*/
package data.paciente;

import java.time.LocalDate;

public class Consulta {
    private LocalDate _dataDaConsulta;
    
    private Paciente pacientes = new Paciente();
    
    public Consulta() {
        _dataDaConsulta = LocalDate.of(1, 1, 1);
    }

    
    public LocalDate getDataDaConsulta(){
        return _dataDaConsulta;
    }
    public void setDataDaConsulta(LocalDate dataDaConsulta) {
        this._dataDaConsulta = dataDaConsulta;
    }
}
