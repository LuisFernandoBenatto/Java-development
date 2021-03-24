package data.modelo;

import java.io.Serializable;

public class Usuarios implements Serializable{
    private String id;
    private String login;
    private String nome;
    private String senha;
    
    public Usuarios() {
        this.id = ""; 
        this.login = "";
        this.nome = "";
        this.senha = "";
    }

    public Usuarios(String id, String login, String nome, String senha) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getId() {
        return id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(String id) {
        this.id = id;
    }  
}
