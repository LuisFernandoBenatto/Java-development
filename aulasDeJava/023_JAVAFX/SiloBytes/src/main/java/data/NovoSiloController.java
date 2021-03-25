package data;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class NovoSiloController {
    
    @FXML
    private TextArea inputList;
    
    @FXML
    private TextField campoNumeroDaVenda;
    
    @FXML
    private TextField campoCPF_Produtor;

    @FXML
    private TextField campoGrao;
    
    @FXML
    private TextField campoQuantidade;

    @FXML
    private DatePicker campoDataEntrada;
    
    @FXML
    private DatePicker campoDataSaida;
    
    /*------------------------------------------------------------------------*/
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
    private void consultarSilo() throws IOException{
        App.setRoot("consultarSilo");
    }
    @FXML
    private void saidaDeProduto() throws IOException{
        App.setRoot("saidaDeProduto");
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
    @FXML
    private void voltar() throws IOException{
        App.setRoot("menu");
    }
    @FXML
    private void sair(){
        System.exit(0);
    }
}
