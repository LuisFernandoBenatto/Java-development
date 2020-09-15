package data.listadepacientes;

public class Paciente {
    private int codigo;
    private String nome;
    
    public Paciente(){
        codigo = 0;
        nome = "";
    }
    
    public Paciente(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome; 
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
