package funcional;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizador <T, U> {

  private final Map<T, U> cache = new ConcurrentHashMap<>();

  private Memoizador() {}

  private Function<T, U> computar(final Function<T, U> funcao) {
    return input -> cache.computeIfAbsent(input, funcao::apply);
  }

  public static <T, U> Function<T, U> memoizar(final Function<T, U> funcao) {
    return new Memoizador<T, U>().computar(funcao);
  }
}