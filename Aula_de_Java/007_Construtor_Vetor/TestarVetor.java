package testarvetor;

public class TestarVetor {

    public static void main(String[] args) {
        String vet[] = new String[10];
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = "teste"; 
            System.out.println(vet[i]);
        }
        
        ClassVetor[] _classvetor = new ClassVetor[10];
        
        for (int i = 0; i < _classvetor.length; i++) {
            ClassVetor classVetor = _classvetor[i];         
            _classvetor[i] = new ClassVetor();
            _classvetor[i].vetor = "teste";
            System.out.println(_classvetor[i].vetor + "-" + (i + 1));
        }
    }
    
}
