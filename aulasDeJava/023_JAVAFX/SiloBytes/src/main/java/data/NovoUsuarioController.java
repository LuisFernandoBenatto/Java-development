package data;

import data.modelo.Usuarios;
import data.util.Arquivo;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NovoUsuarioController {
    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoNomeUsuario;

    @FXML
    private TextField campoSenha;
    
    @FXML
    private void cadastrarUsuario(){
        Usuarios usuario = new Usuarios();
        usuario.setLogin(campoLogin.getText());
        usuario.setNome(campoNomeUsuario.getText());
        usuario.setSenha(campoSenha.getText());
        Arquivo.inserir(usuario);
        limparCampos(); 
    }
    
    
    @FXML
    private void limparCampos(){
        this.campoLogin.setText("");
        this.campoNomeUsuario.setText("");
        this.campoSenha.setText("");
    }
    
    
    @FXML
    private void voltar() throws IOException{
        App.setRoot("menu");
    }
   
    @FXML
    private void fechar(){
        System.exit(0); 
    }
}
