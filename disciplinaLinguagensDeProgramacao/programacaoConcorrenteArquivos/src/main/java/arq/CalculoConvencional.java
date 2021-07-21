package arq;

import java.io.File;

public class CalculoConvencional {
  public static long calcular(File file) {
    long size = 0;

    if (file.isFile()) {
      size = file.length();
    } else {
      File[] arqs = file.listFiles();
      if (arqs != null) {
        for (File arq : arqs) {
          size += CalculoConvencional.calcular(arq);
        }
      }
    }
    return size;
  }
}