package data;

import data.modelo.Armazenagem;
import data.modelo.Produtores;
import data.util.ArquivoProdutor;
import data.util.ArquivoSilo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AReceberController {
    
    @FXML
    private TextArea inputList;
    
    @FXML
    private TextField campoID_Produtor;

    @FXML
    private TextField campoValorRecebido;
    
    @FXML
    Armazenagem armazem = new Armazenagem();

    @FXML
    private void pagar() throws IOException{    
        double valor = Double.parseDouble(campoValorRecebido.getText());
        ArrayList<Produtores> lista = ArquivoProdutor.listar();
        for(Produtores p : lista){
            if(p.getID().equals(campoID_Produtor.getText())){
               p.setDividaMenor(valor);
                try {
                    ArquivoProdutor.alterar(campoID_Produtor.getText(), p);
                    System.out.println("Pago!");
                    this.limparCampos();
                } catch(Exception e) {
                    System.out.println("Não foi Pago!");
                    this.limparCampos();
                    App.setRoot("menu");
                }  
            }
        }
    }
    
    @FXML
    private void listar(ActionEvent even){
        ArrayList<Armazenagem> lista = ArquivoSilo.listar();
        for(Armazenagem a : lista){
            inputList.appendText("Codigo da Venda: " + a.getNumeroDaVenda() + " | ");        
            inputList.appendText("CPF do Produtor: " + a.getCPF_Produtor() + " | ");
            inputList.appendText("ID do Produtor: " + a.getID_Produtor() + " | ");
            inputList.appendText("Grão: " + a.getGrao() + " | "); 
            inputList.appendText("Data de Entrada: " + a.getDataEntrada() + " | "); 
            inputList.appendText("Data de Saída: " + a.getDataSaida() + " | ");
            inputList.appendText("Quantidade: " + a.getQuantidade() + " | "); 
            inputList.appendText("Valor da Total: " + a.getValorTotal() + "\n\n");
        }
    }
    
    @FXML
    private void limparCampos(){
        this.campoID_Produtor.setText("");
        this.campoValorRecebido.setText("");
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
