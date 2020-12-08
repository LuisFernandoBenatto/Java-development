package Atividade;

public class NewClass {
    public static <T extends Number> Double getDouble(T valor) {
        int valorInteiro = valor.intValue();
        return valor.doubleValue() - valorInteiro;
    }
}