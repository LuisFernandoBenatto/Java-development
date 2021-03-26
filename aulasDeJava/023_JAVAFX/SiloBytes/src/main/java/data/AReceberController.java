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
    private TextArea campoLista;
    
    @FXML
    private TextField campoCPF_Produtor;

    @FXML
    private TextField campoValorRecebido;

    @FXML
    private void pagar() throws IOException{
        double valor = Double.parseDouble(campoValorRecebido.getText());
        ArrayList<Produtores> lista = ArquivoProdutor.listar();
        for(Produtores p : lista){   
            if(p.getCPF().equals(campoCPF_Produtor.getText())){
                p.setDividaMenor(valor);
                ArquivoProdutor.alterar(campoCPF_Produtor.getText(), p);
            }
        }
        App.setRoot("menu");
    }
    
    @FXML
    private void listar(ActionEvent even){
        ArrayList<Armazenagem> lista = ArquivoSilo.listar();
        for(Armazenagem a : lista){
            campoLista.appendText(" Codigo da Venda: " + a.getNumeroDaVenda() + 
                    "\t Vendedor:" + a.getVendedorNome() +
                    "\t CPF do Produtor: " + a.getCPF_Produtor() + 
                    "\n\t Grão: " + a.getGrao() + 
                    "\n\t Data de Entrada: " + a.getDataEntrada() + 
                    "\n\t Data de Saída: " + a.getDataSaida() + 
                    "\n\t Quantidade: " + a.getQuantidade() + 
                    "\n\t Valor da Total: " + a.getValorTotal() +"\n\n");
        }
    }
    
    @FXML
    private void limparCampos(){
        this.campoCPF_Produtor.setText("");
        this.campoValorRecebido.setText("");
        this.campoLista.setText("");
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
