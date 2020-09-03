package capitulo_6.aula_01_09_2020.c;

public class C {
    public static void main(String[] args) {
        ClassCaixa caixa = new ClassCaixa();
        
        caixa.setId(10);
        caixa.setConteudo("Novo valor!\n");
        
        System.out.println(caixa.getConteudo());
        System.out.println(caixa.getId() + "\n");
                
        //------------------
        
        int contador = 0;
        modificar(caixa, contador);
        System.out.println(contador + "\n");
        System.out.println(caixa.getConteudo()); 
                
        //------------------
        
        String _string = "Opa! Não foi alterada!\n";
        modificador(_string);
        System.out.println(_string);
        
        //------------------
        
        ClassCaixa novaCaixa = criarCaixa(); 
        System.out.println(novaCaixa.getConteudo());
    }
    
    public static void modificar(ClassCaixa caixa, int valor) {
        caixa.setConteudo("Alterando valor do conteudo!\n");
        valor = 99;
    }
    
    public static void modificador(String texto) {
        texto = "Valor qualquer para realizar testes!";
    }
    
    public static ClassCaixa criarCaixa () {
        ClassCaixa caixa = new ClassCaixa();
        caixa.setId(1);
        caixa.setConteudo("Primeiro item da caixa\n");
        
        return caixa;
    }
}
