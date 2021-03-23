package data;

import data.modelo.Usuarios;
import data.util.ArquivoUsuario;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class ListarUsuarioController {
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
    private void aReceber() throws IOException{
        App.setRoot("aReceber");
    }
    @FXML
    private void ajuda() throws IOException{
        App.setRoot("ajuda");
    }
}
