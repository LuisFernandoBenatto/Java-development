package data.excecoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        String endereco = "C:\\Users\\Computer\\Documents\\NetBeansProjects\\Excecoes\\src\\main\\java\\data\\excecoes";
        try {
            reader = new BufferedReader(
                    new FileReader(endereco + "\\Conteudo.txt"));
            String l;
            while((l = reader.readLine())!= null) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println("Erro na tentativa de ler o arquivo de texto: " + e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e){
                    System.out.println("Erro ao tentar fechar o arquivo de texto: " + e);
                }
            }
        }
    }
}
