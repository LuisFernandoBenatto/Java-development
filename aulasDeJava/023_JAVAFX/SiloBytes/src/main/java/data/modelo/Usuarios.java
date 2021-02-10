package data.modelo;

import java.io.Serializable;

public class Usuarios implements Serializable{
    private String login;
    private String nome;
    private String senha;
    
    public Usuarios() {
        this.login = "";
        this.nome = "";
        this.senha = "";
    }

    public Usuarios(String login, String nome, String senha) {
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

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
