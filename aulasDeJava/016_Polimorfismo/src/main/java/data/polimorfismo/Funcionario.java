package data.polimorfismo;

public class Funcionario {
    private String Nome;
    private String CPF;
    private String Telefone;
    protected Double Salario;
    
    public Funcionario(String Nome, String CPF, String Telefone) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }
    
    public String getNome() {
        return this.Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    public String getCPF() {
        return this.CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getTelefone() {
        return this.Telefone;
    }
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    public Double getSalario() {
        return this.Salario;
    }
    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }
    
    public String getDados() {
        return "Nome: " + this.getNome() + " \n " +
               "CPF: " + this.getCPF() + " \n " +
               "Telefone: " + this.getTelefone() + " \n " +  
               "Salario: " + String.format("%2.f", this.getSalario());
    }
}
