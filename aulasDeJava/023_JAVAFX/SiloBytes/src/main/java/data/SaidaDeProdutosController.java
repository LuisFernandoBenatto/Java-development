package data;

import data.modelo.Armazenagem;
import data.util.ArquivoSilo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SaidaDeProdutosController {
    
    @FXML
    private TextArea inputList;
    
    
    @FXML
    private void listar(ActionEvent even){
        ArrayList<Armazenagem> lista = ArquivoSilo.listar();
        
        for(Armazenagem a : lista){
            inputList.appendText("Codigo da Venda: " + a.getNumeroDaVenda() + " | ");       
            inputList.appendText("CPF do Produtor: " + a.getCPF_Produtor() + " | "); 
            inputList.appendText("Grão: " + a.getGrao() + " | "); 
            inputList.appendText("Data de Entrada: " + a.getDataEntrada() + " | "); 
            inputList.appendText("Data de Saída: " + a.getDataSaida() + " | ");
            inputList.appendText("Quantidade: " + a.getQuantidade() + " | "); 
            inputList.appendText("Valor da Total: " + a.getValorTotal() + "\n\n");
        }
    }
    
    @FXML
    private void limparCampos(){
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
