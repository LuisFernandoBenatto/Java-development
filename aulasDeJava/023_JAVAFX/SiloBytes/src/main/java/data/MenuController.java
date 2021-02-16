package data;

import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController {
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    @FXML
    private void cadastrarProdutor() throws IOException{
        App.setRoot("novoProdutor");
    }
    @FXML
    private void listaUsuario() throws IOException{
        App.setRoot("listaUsuario");
    }
    @FXML
    private void listaProdutor() throws IOException{
        App.setRoot("listaProdutor");
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
    private void sair(){
        System.exit(0);
    }
}
