package data;

import data.modelo.Armazenagem;
import data.util.ArquivoSilo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ConsultarSiloController {
    
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
    
    @FXML
    private void listagemDosSilos(){
        ArrayList<Armazenagem> lista = ArquivoSilo.listar();
    
        for(Armazenagem a : lista){
            inputList.appendText("Numero Da Venda: " + a.getNumeroDaVenda() + " | ");
            inputList.appendText("CPF do Produtor: " + a.getCPF_Produtor() + " | ");
            inputList.appendText("Grão: " + a.getGrao() + " | ");
            inputList.appendText("Quantidade: " + a.getQuantidade() + " | ");
            inputList.appendText("DataEntrada: " + a.getDataEntrada() + " | ");
            inputList.appendText("DataSaída: " + a.getDataSaida() + " | ");
            inputList.appendText("Valor Total: " + a.getValorTotal() + "\n\n");
        }
    }
    
    @FXML
    Armazenagem armazem = new Armazenagem();
    
    @FXML
    private void alterarArmazenagem() throws IOException {
        armazem.setGrao(campoGrao.getText());
        armazem.setQuantidade(Integer.valueOf(campoQuantidade.getText()));
        armazem.setDataSaida(campoDataSaida.getValue());
        try {
            ArquivoSilo.alterar(Long.valueOf(campoNumeroDaVenda.getText()), armazem, campoDataSaida.getValue());
            this.limparCampos();
        } catch (Exception e) {
            this.limparCampos();
            App.setRoot("menu");
        }   
    }
    @FXML
    private void excluirArmazenagem() throws IOException{
        armazem.setNumeroDaVenda(Long.valueOf(campoNumeroDaVenda.getText()));
        try {
            ArquivoSilo.excluir(Long.valueOf(campoNumeroDaVenda.getText()), armazem);
            this.limparCampos();
        } catch (Exception e) {
            this.limparCampos();
            App.setRoot("menu");
        } 
    }
    @FXML
    private void limparCampos(){
        this.campoNumeroDaVenda.setText("");
        this.campoGrao.setText("");
        this.campoQuantidade.setText("");
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
