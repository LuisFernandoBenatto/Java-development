package data.polimorfismo;

public class Aluno {
    private String Nome;
    private String Matricula;
    
    public Aluno() {
        this.Nome = "";
        this.Matricula = "";
    }
    public Aluno(String Nome, String Matricula) {
        this.Nome = Nome;
        this.Matricula = Matricula;
    }
    
    public String getNome() {
        return this.Nome;
    }
    public String getNome(boolean primeiroNome) {
        if(primeiroNome) {
            return this.Nome.split(" ")[0];
        } else {
            return this.Nome;
        }
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getMatricula() {
        return this.Matricula;
    }
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
}
