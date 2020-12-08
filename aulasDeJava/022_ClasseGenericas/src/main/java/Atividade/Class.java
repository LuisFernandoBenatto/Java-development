package Atividade;

public class Class <E, M, D>{
    E esquerda;
    M meio;
    D direita;

    public Class() {
    }
    public Class(E esquerda, M meio, D direita) {
        this.esquerda = esquerda;
        this.meio = meio;
        this.direita = direita;
    }
    @Override
    public String toString() {
        return "Esquerda: " + esquerda + " - " +
                "Meio: " + meio + " - " +
                "Direito: " + direita;
    } 
}