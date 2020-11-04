/*
	2) Crie a implementação de Lista Dinâmica encadeada simples 
    implementando os métodos de inserção, remoção e busca dos elementos. 
    Faça um menu de opções, onde o usuário possa escolher as operações 
    que deseja realizar. Use uma estrutura No que armazene as seguintes 
    informações de um Atleta: Nome, Altura (float), Peso(float), Esporte, 
    Patrocinadores.
 */
package Exercicio_II;

public class No {
    private String Nome;
    private float Altura;
    private float Peso;
    private String Esporte;
    private String Patrocinador;
    
    No prox;

    public No() {
        this.Nome = "";
        this.Altura = 0;
        this.Peso = 0;
        this.Esporte = "";
        this.Patrocinador = "";
    }
    public No(String Nome, float Altura, float Peso, String Esporte,
                            String Patrocinador) {
        this.Nome = Nome;
        this.Altura = Altura;
        this.Peso = Peso;
        this.Esporte = Esporte;
        this.Patrocinador = Patrocinador;
    }
    public float getAltura() {
        return Altura;
    }
    public String getEsporte() {
        return Esporte;
    }
    public String getNome() {
        return Nome;
    }
    public String getPatrocinador() {
        return Patrocinador;
    }
    public float getPeso() {
        return Peso;
    }
    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
    public void setEsporte(String Esporte) {
        this.Esporte = Esporte;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setPatrocinador(String Patrocinador) {
        this.Patrocinador = Patrocinador;
    }
    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    @Override
    public String toString() {
        if(prox != null) {
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) 
              + "\n" +
              "-> Nome: " + this.getNome() + "\n" +
              "-> Altura: " + this.getAltura() + " cm" +  "\n" +
              "-> Peso: " + this.getPeso() + " kg" + "\n" +
              "-> Esporte: " + this.getEsporte() + "\n" +
              "-> Patrocinador: " + this.getPatrocinador() + "\n" +
              "Ponteiro proximo: " + this.prox.getClass() + "@" + 
                    Integer.toHexString(prox.hashCode());
        } else {
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) 
                    + "\n" +
                    "-> Nome: " + this.getNome() + "\n" +
                    "-> Altura: " + this.getAltura() + " cm" + "\n" +
                    "-> Peso: " + this.getPeso() + " kg" + "\n" +
                    "-> Esporte: " + this.getEsporte() + "\n" +
                    "-> Patrocinador: " + this.getPatrocinador() + "\n" +
                    "Ponteiro proximo: " + "null";
        } 
    }
    
}
