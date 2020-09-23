package Questao_3;

public class Caixa {
    public int flag;
    
    public Caixa() {
        this.flag = 0;
    }
    public Caixa(int _flag) {
        this.flag = _flag;
    }
    public void setFlag(int _flag){
        this.flag = _flag;
    }
    public int getFlag(){
        return this.flag;
    }
}
