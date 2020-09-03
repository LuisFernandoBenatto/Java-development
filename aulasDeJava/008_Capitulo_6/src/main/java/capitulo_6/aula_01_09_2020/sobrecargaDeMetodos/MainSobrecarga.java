package capitulo_6.aula_01_09_2020.sobrecargaDeMetodos;

public class MainSobrecarga {

    public static void main(String[] args) {
        SobrecargaDeMetodos sobrecarga = new SobrecargaDeMetodos();
        
        System.out.println(sobrecarga.somar(10));
        System.out.println(sobrecarga.somar(58, 65));
        System.out.println(sobrecarga.somar(58, 65, 125));
        
        sobrecarga.imprimir(37, 66);
        sobrecarga.imprimir(49, 31);
        sobrecarga.imprimir(24, 24);
        
        sobrecarga.imprimir(5, "Texto!!!!!!!");
        sobrecarga.imprimir(3, 2, "Texto!");
    }
    
}
