package data.listadepacientes;

import java.time.LocalDate;

public class Consulta {
    private LocalDate data; 
    private Paciente paciente; 
        
    public Consulta(){
        data = LocalDate.now();
        paciente = new Paciente(); 
    }
        
    public Consulta(LocalDate data, Paciente paciente){
        this.data = data;
        this.paciente = paciente;
    }
        
    public void setData(LocalDate data){
        this.data = data; 
    }
        
    public LocalDate getData(){
        return this.data; 
    }
        
    public void setPaciente(Paciente paciente){
        this.paciente = paciente; 
    }
        
    public Paciente getPaciente(){
        return this.paciente; 
    }
}
