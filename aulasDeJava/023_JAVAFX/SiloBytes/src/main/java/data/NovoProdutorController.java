package data;

import data.modelo.Produtores;
import data.util.Arquivo;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NovoProdutorController {
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    @FXML
    private TextField campoNomeProdutor;
    @FXML
    private TextField campoProduto;
    @FXML
    private TextField campoDataDeEntrada;
    @FXML
    private TextField campoQuantidadeDeProduto;   
    
    @FXML
    private void cadastrarProdutor(){
        Produtores produtor = new Produtores();
        produtor.setNomeProdutor(campoNomeProdutor.getText());
        produtor.setProduto(campoProduto.getText());
        produtor.setQuantidadeDeProduto(campoQuantidadeDeProduto.getText());
        produtor.setDataDeEntrada(campoDataDeEntrada.getText());
        Arquivo.inserirP(produtor);
        limparCampos(); 
    }
    
    @FXML
    private void limparCampos(){
        this.campoNomeProdutor.setText("");
        this.campoProduto.setText("");
        this.campoDataDeEntrada.setText("");
        this.campoQuantidadeDeProduto.setText("");
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
