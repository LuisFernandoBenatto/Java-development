package data;

import data.modelo.Produtores;
import data.util.ArquivoProdutor;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NovoProdutorController {
    @FXML
    private TextField campoNomeProdutor;

    @FXML
    private TextField campoCPF;

    @FXML
    private DatePicker campoDataNascimento;
    
    @FXML
    private TextField campoTelefone;
    
    @FXML
    private Label lblMsg;
    
    
    @FXML
    private void cadastrarProdutor(){
        Produtores produtor = new Produtores();
        produtor.setNomeProdutor(campoNomeProdutor.getText());
        produtor.setCPF(campoCPF.getText());
        produtor.setDataNascimento(campoDataNascimento.getValue());
        produtor.setTelefone(campoTelefone.getText());
        try {
            ArquivoProdutor.inserir(produtor);
            this.limparCampos();
            lblMsg.setText(produtor.getNomeProdutor() + " cadastrado com sucesso!");
        } catch (Exception e) {
            lblMsg.setText("Erro ao cadastrar!");
        }    
    }
    
    @FXML
    private void limparCampos(){
        this.campoNomeProdutor.setText("");
        this.campoCPF.setText("");
        this.campoDataNascimento.getEditor().clear();
        this.campoTelefone.setText("");
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
    private void ajuda() throws IOException{
        App.setRoot("ajuda");
    }
}
