package data;

import data.modelo.Armazenagem;
import data.modelo.Produtores;
import data.util.ArquivoProdutor;
import data.util.ArquivoSilo;
import java.io.IOException;
import java.util.ArrayList;
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
    private TextField campoID_Produtor;
    
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
    private void cadastrarNovoSilo() throws IOException{
        Armazenagem armazem = new Armazenagem();
        ArrayList<Produtores> lista = ArquivoProdutor.listar();
        armazem.setNumeroDaVenda(Long.valueOf(campoNumeroDaVenda.getText()));
        armazem.setID_Produtor(campoID_Produtor.getText());
        armazem.setCPF_Produtor(campoCPF_Produtor.getText());
        armazem.setGrao(campoGrao.getText());
        armazem.setQuantidade(Integer.valueOf(campoQuantidade.getText()));
        armazem.setDataEntrada(campoDataEntrada.getValue());
        armazem.setDataSaida(campoDataSaida.getValue());
        for(Produtores p : lista){   
            if(p.getCPF().equals(campoCPF_Produtor.getText())){
                p.setDividaMaior(armazem.getValorTotal());
                ArquivoProdutor.alterar(campoCPF_Produtor.getText(), p);
            }
        }
        try {
            ArquivoSilo.inserir(armazem);
            this.limparCampos();
        } catch (Exception e) {
            this.limparCampos();
            App.setRoot("menu");
        }    
    }
    
    @FXML
    private void limparCampos(){
        this.campoNumeroDaVenda.setText("");
        this.campoID_Produtor.setText("");
        this.campoCPF_Produtor.setText("");
        this.campoGrao.setText("");
        this.campoQuantidade.setText("");
        this.campoDataEntrada.getEditor().clear();
        this.campoDataSaida.getEditor().clear();
        this.inputList.setText("");
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
    private void novoSilo() throws IOException{
        App.setRoot("novoSilo");
    }
    @FXML
    private void consultarSilos() throws IOException{
        App.setRoot("consultarSilos");
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
