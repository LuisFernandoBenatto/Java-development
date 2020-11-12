/*
        4) A) Crie uma lista duplamente encadeada que gerencie informações 
    ordenadas sobre um aluno (indexar por nome) que deve conter as seguintes 
    informações: nome do Aluno, Matricula, Coeficiente de Rendimento (Nota) e 
    Nome do Curso. Implemente o método para cadastro e impressão de alunos.
 */
package Exercicio_IV;

public class No {
    Estudante estudante;
    No ant;
    No prox;
    
    public No(Estudante estudante) {
        this.estudante = estudante;
    }
    @Override
    public String toString() {
        if(this.prox != null && this.ant != null) {
            return(
                "Estudante: " + this.estudante + " - " + 
                "Ponteiro anterior: " + this.ant.getClass() +
                "@" + Integer.toBinaryString(this.ant.hashCode()) + " - " +
                "Ponteiro proximo: " + this.prox.getClass() + 
                "@" + Integer.toBinaryString(this.prox.hashCode()));
        } else if (this.prox != null) {
            return(
                "Estudante: " + this.estudante + " - " + 
                "Ponteiro anterior: null" + " - " +
                "Ponteiro proximo: " + this.prox.getClass() + 
                "@" + Integer.toBinaryString(this.prox.hashCode()));
        } else if (this.ant != null) {
            return(
                "Estudante: " + this.estudante + " - " + 
                "Ponteiro anterior: " + this.ant.getClass() +
                "@" + Integer.toBinaryString(this.ant.hashCode()) + " - " +
                "Ponteiro proximo: null");
        } else {
            return(
                "Estudante: " + this.estudante + " - " + 
                "Ponteiro anterior: null" + " - " +
                "Ponteiro proximo: null");
        }
    }   
}
