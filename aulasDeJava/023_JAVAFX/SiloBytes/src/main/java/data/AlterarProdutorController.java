package data;

import data.modelo.Produtores;
import data.util.ArquivoProdutor;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlterarProdutorController {
    
    @FXML
    private TextField campoID_;
    
    @FXML
    private TextField campoNomeProdutor;

    @FXML
    private TextField campoCPF;

    @FXML
    private DatePicker campoDataNascimento;
    
    @FXML
    private TextField campoTelefone;
    
    @FXML
    private TextArea inputList;
    
    @FXML
    private void listagemProdutores(){
        ArrayList<Produtores> lista = ArquivoProdutor.listar();
    
        for(Produtores p : lista){
            inputList.appendText("ID: " + p.getID() + " | ");
            inputList.appendText("Nome Produtor: " + p.getNomeProdutor() + " | ");
            inputList.appendText("CPF: " + p.getCPF() + " | ");
            inputList.appendText("DataNascimento: " + p.getDataNascimento() + " | ");
            inputList.appendText("Telelefone: " + p.getTelefone() + "\n\n"); 
        }
    }
    
    @FXML
    private void alterarProdutor() throws IOException{
        Produtores produtor = new Produtores();
        produtor.setNomeProdutor(campoNomeProdutor.getText());
        produtor.setCPF(campoCPF.getText());
        produtor.setDataNascimento(campoDataNascimento.getValue());
        produtor.setTelefone(campoTelefone.getText());
        try {
            ArquivoProdutor.alterar(campoID_.getText(), produtor);
            this.limparCampos();
        } catch (Exception e) {
            this.limparCampos();
            App.setRoot("menu");
        }   
    }
    
    @FXML
    private void limparCampos(){
        this.campoID_.setText("");
        this.campoNomeProdutor.setText("");
        this.campoCPF.setText("");
        this.campoDataNascimento.getEditor().clear();
        this.campoTelefone.setText("");
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
    private void cadastrarProdutor() throws IOException{
        App.setRoot("novoProdutor");
    }
    @FXML
    private void listarProdutor() throws IOException{
        App.setRoot("listarProdutor");
    }
    @FXML
    private void excluirProdutor() throws IOException{
        App.setRoot("excluirProdutor");
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
