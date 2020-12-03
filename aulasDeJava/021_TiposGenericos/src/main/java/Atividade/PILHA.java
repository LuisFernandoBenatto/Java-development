package Atividade;

import java.util.ArrayList;        

public class PILHA {
    ArrayList<Object> elementos;
    
    public PILHA() {
        elementos = new ArrayList(); 
    }
    public void empilhar(Object s) {
        elementos.add(s);
    }
    public Object desempilhar() {
        if(elementos.isEmpty()) {
            return null;
        }
        Object aux = elementos.get(elementos.size()-1);
        elementos.remove(elementos.size()-1);
        return aux;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Object s : elementos){
            sb.append(s);
            sb.append(" | ");
        }
        return sb.toString();
    }
}
