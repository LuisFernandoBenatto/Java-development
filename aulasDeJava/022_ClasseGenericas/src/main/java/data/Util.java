package data;

public class Util {
    public static Integer getUltimo(Integer[] elementos) {
        return elementos [(elementos.length) - 1];
    }
    public static <T> T getLast(T[] elementos) {
        return elementos [(elementos.length) - 1];
    }
    public static Integer somaElementos(Integer[] elementos) {
        Integer soma = 0;
        for (int i = 0; i < elementos.length; i++) {
            soma += elementos[i];
        }
        return soma;
    }
    public static <T extends Number> Double somaElementos(T[] elementos) {
        Double soma = 0.0;
        for (int i = 0; i < elementos.length; i++) {
            soma += elementos[i].doubleValue();
        }
        return soma;
    }
}
