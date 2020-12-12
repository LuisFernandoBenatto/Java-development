package Map;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        String frase = "É preciso estudar volapuque, " +
                       "é preciso estar sempre bêbedo, " + 
                       "é preciso ler Baudelaire, " +
                       "é preciso colher as flores " +
                       "de que rezam velhos autores. "
                       .replace(",", "");
        System.out.println(
            contadorDePalavras(
                   frase.toLowerCase()
                           .replace(".", "").split(" "))
        );
    }  
    public static Map<String, Integer> contadorDePalavras(String[] frase) {
        Map<String, Integer> map = new HashMap<> ();
        for (String s:frase) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                int contador = map.get(s);
                map.put(s, contador + 1);              
            }
        }
        return map;
    }
}
