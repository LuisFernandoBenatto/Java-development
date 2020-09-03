package capitulo_6.aula_01_09_2020.c;

public class ClassCaixa {
    private int _id;
    private String _conteudo;
    
    public ClassCaixa() {
        _id = 0;
        _conteudo = ""; 
    }
    
    public int getId() {
        return _id;
    }
    
    public void setId(int id) {
        this._id = id; 
    }
    
    public String getConteudo() {
        return _conteudo;
    }
    
    public void setConteudo(String conteudo) {
        this._conteudo = conteudo; 
    }
}
