package data;

import java.io.IOException;
import javafx.fxml.FXML;

public class MenuController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    @FXML
    private void cadastrarProdutor() throws IOException{
        App.setRoot("novoProdutor");
    }
    @FXML
    private void novoSilo() throws IOException{
        App.setRoot("novoSilo");
    }
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
    private void listarProdutor() throws IOException{
        App.setRoot("listarProdutor");
    }
    @FXML
    private void alterarProdutor() throws IOException{
        App.setRoot("alterarProdutor");
    }
    @FXML
    private void excluirProdutor() throws IOException{
        App.setRoot("excluirProdutor");
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
