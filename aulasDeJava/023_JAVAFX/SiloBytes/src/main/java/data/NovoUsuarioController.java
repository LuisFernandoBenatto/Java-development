package data;

import data.modelo.Usuarios;
import data.util.ArquivoUsuario;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NovoUsuarioController {
    @FXML
    private TextField campoID;
    
    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoNomeUsuario;

    @FXML
    private TextField campoSenha;
    
    @FXML
    private Label labelMensagem;
    
    @FXML
    private void cadastrarUsuario(){
        Usuarios usuario = new Usuarios();
        usuario.setId(campoID.getText());
        usuario.setLogin(campoLogin.getText());
        usuario.setNome(campoNomeUsuario.getText());
        usuario.setSenha(campoSenha.getText());
        try {
            ArquivoUsuario.inserir(usuario);
            labelMensagem.setText("Cadastrado com sucesso!");
            limparCampos();
        } catch (Exception e) {
            limparCampos();
            labelMensagem.setText("Erro ao cadastrar!");
        }  
    }  
    @FXML
    private void limparCampos(){
        this.campoID.setText("");
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
    /*------------------------------------------------------------------------*/
    @FXML
    private void listarUsuario() throws IOException{
        App.setRoot("listarUsuario");
    }
    @FXML
    private void alterarUsuario() throws IOException{
        App.setRoot("alterarUsuario");
    }
    @FXML
    private void excluirUsuario() throws IOException{
        App.setRoot("excluirUsuario");
    }
    @FXML
    private void cadastrarProdutor() throws IOException{
        App.setRoot("novoProdutor");
    }  
    @FXML
    private void entradaDeProdutos() throws IOException{
        App.setRoot("entradaDeProdutos");
    }
    @FXML
    private void saidaDeProdutos() throws IOException{
        App.setRoot("saidaDeProdutos");
    }
    @FXML
    private void ajuda() throws IOException{
        App.setRoot("ajuda");
    }
    @FXML
    private void aReceber() throws IOException{
        App.setRoot("aReceber");
    }
}
