/*
	1) De acordo com a estrutura de uma lista encadeada listada abaixo, 
    e considerando que cada alocação de um bloco em memória ocorre obedecendo 
    a sequência numérica, mostre a situação da memória, (não esqueça de 
    preencher o conteúdo do ponteiro fim, que estará na segunda posição 
    de memória) sabendo que: 
 */
package Exercicio_I;

public class No {
    private String nome;
    private Double nota;
    protected No prox;

    public No() {
        this.nome = "";
        this.nota = 0.0;
    }

    public No(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public Double getNota() {
        return nota;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(Double nota) {
        this.nota = nota;
    }   

    @Override
    public String toString() {
        if(prox != null) {
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) 
              + " - " +
              "No -> Nome: " + this.getNome() + " - " +
              "Nota: " + this.getNota() + " - " +
              "Ponteiro proximo: " + this.prox.getClass() + "@" + 
                    Integer.toHexString(prox.hashCode());
        } else {
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) 
                    + " - " +
                    "No -> Nome: " + this.getNome() + " - " +
                    "Nota: " + this.getNota() + " - " +
                    "Ponteiro proximo: " + "null";
        }  
    } 
}
