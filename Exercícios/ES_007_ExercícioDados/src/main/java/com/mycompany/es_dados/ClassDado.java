package com.mycompany.es_dados;

public class ClassDado {
    String _texto;
    int _numero;
    
    public void cadastrar(String texto, int numero) {
        this._texto = texto;
        this._numero = numero;
    }    
    public String imprimir() {
        return "texto: " + this._texto + " - " +"Numero: " + this._numero;
    }
}
