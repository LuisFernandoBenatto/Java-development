package capitulo_8;

import java.time.LocalDate;

public interface Util {
    
    public static Integer getAno() {
        return LocalDate.now().getYear();
    }
}
