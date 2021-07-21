package arq;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class CalculoParalelo extends RecursiveTask<Long> {
    private final File file;
    
    public CalculoParalelo(File file) {
        this.file = file;
    }
        
    @Override
    protected Long compute() {
        if(file.isFile()) {
            return file.length();
        }
        return CalculoParalelo
                .invokeAll(criarSubtarefas(file))
                .stream()
                .mapToLong(CalculoParalelo::join)
                .sum();
    }
    
    private Collection<CalculoParalelo> criarSubtarefas(File file) {
        List<CalculoParalelo> subtarefas = new ArrayList<>();
        File[] arr = file.listFiles();
        for(File arqs : arr) {
            subtarefas.add(new CalculoParalelo(arqs));
        }
        return subtarefas;
    }
}
