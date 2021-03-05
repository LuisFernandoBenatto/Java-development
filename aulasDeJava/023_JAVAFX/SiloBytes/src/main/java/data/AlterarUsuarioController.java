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
            inputList.appendText("Nome: "+u.getNome()+"   ");
            inputList.appendText("Login: "+u.getLogin()+"    ");
            inputList.appendText("Senha: "+u.getSenha()+"\n\n"); 
        }
    }
    @FXML
    private void alterarCadastroUsuario(){
        Usuarios usuario = new Usuarios();
        usuario.setLogin(campoLogin.getText());
        usuario.setNome(campoNomeUsuario.getText());
        usuario.setSenha(campoSenha.getText());
        //ArquivoUsuario.inserir(usuario);
        this.limparCampos();
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
    private void entradaDeProdutos() throws IOException{
        App.setRoot("entradaDeProdutos");
    }
    @FXML
    private void saidaDeProdutos() throws IOException{
        App.setRoot("saidaDeProdutos");
    }
    @FXML
    private void aReceber() throws IOException{
        App.setRoot("aReceber");
    }
}
