package funcional;

import java.util.function.Function;

public class Invertedor {
    
    Function<Integer, Double> f = x -> 1.0 / x; 
    
    Function<Integer, Double> finverter = Memoizador.memoizar(f);

}