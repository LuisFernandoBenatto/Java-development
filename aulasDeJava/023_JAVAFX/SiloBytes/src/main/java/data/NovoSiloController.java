package data;

import data.modelo.Armazenagem;
import data.util.ArquivoSilo;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class NovoSiloController {
    @FXML
    private TextField campoEndereco;

    @FXML
    private TextField campoCidade;

    @FXML
    private TextField campoEstado;

    @FXML
    private CheckBox campoAlugado;

    @FXML
    private Slider campoCapacidade;
    
    @FXML
    private void cadastrarSilo(){
        String endereco = campoEndereco.getText() + " " + 
                campoCidade.getText() + " - " + campoEstado.getText();
        double capacidade = campoCapacidade.getValue();
        boolean alugado = campoAlugado.isSelected();
        try {
            Armazenagem silo = new Armazenagem(endereco, capacidade, alugado);
            ArquivoSilo.inserir(silo);
            limparCampos();
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar silo!");
        }
    }
    @FXML
    private void limparCampos(){
        campoEndereco.setText("");
        campoAlugado.setSelected(false);
        campoCidade.setText("");
        campoEstado.setText("");
        campoCapacidade.setValue(0);
    }
    @FXML
    private void sair(){
        System.exit(0);
    }
}
