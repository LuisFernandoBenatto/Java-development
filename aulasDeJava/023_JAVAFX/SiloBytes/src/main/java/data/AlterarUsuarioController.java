package data;

import data.modelo.Usuarios;
import data.util.ArquivoUsuario;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlterarUsuarioController {
    @FXML
    private TextField campoID_;
    
    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoNomeUsuario;

    @FXML
    private TextField campoSenha;
    
    @FXML
    private TextArea inputList;
    
    @FXML
    private void listagemUsuario(){
        ArrayList<Usuarios> lista = ArquivoUsuario.listar();
    
        for(Usuarios u : lista){
            inputList.appendText("ID: "+u.getId()+" | ");
            inputList.appendText("Nome: "+u.getNome()+" | ");
            inputList.appendText("Login: "+u.getLogin()+" | ");
            inputList.appendText("Senha: "+u.getSenha()+"\n\n"); 
        }
    }
    @FXML
    private void alterarCadastroUsuario() throws IOException{
        Usuarios novoUsuario = new Usuarios();
        novoUsuario.setLogin(campoLogin.getText());
        novoUsuario.setNome(campoNomeUsuario.getText());
        novoUsuario.setSenha(campoSenha.getText());
        try {
            ArquivoUsuario.alterar(campoID_.getText(), novoUsuario);
            this.limparCampos();
        } catch(Exception e) {
            this.limparCampos();
            App.setRoot("menu");
        }
    }  
    
    @FXML
    private void limparCampos(){
        this.campoID_.setText("");
        this.campoLogin.setText("");
        this.campoNomeUsuario.setText("");
        this.campoSenha.setText("");
        this.inputList.setText("");
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
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    } 
    @FXML
    private void listarUsuario() throws IOException{
        App.setRoot("listarUsuario");
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
    private void saidaDeProdutos() throws IOException{
        App.setRoot("saidaDeProdutos");
    }
    @FXML
    private void aReceber() throws IOException{
        App.setRoot("aReceber");
    }
    @FXML
    private void ajuda() throws IOException{
        App.setRoot("ajuda");
    }
    @FXML
    private void novoSilo() throws IOException{
        App.setRoot("novoSilo");
    }
    @FXML
    private void consultarSilos() throws IOException{
        App.setRoot("consultarSilos");
    }
}
