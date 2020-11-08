package data.excecoes;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NewMain {
    public static void main(String[] args) {
        
        try {
            int a = 2;
            int b = 0;
            System.out.println("a / b = " + a / b);
        } catch(Exception e) {
            System.out.println("Erro: " + e.toString());
        }
        
        try {
            String arquivo = "C:\\Users\\Computer\\Documents\\Recovery.txt";
            byte[] bytes = Files.readAllBytes(Paths.get(arquivo));
            String texto = Charset.defaultCharset().decode(ByteBuffer.wrap(bytes)).toString();
            System.out.println("Texto: " + texto);
        } catch(Exception e) {
            System.out.println("Erro: " + e.toString());
        }

    }
    
}
