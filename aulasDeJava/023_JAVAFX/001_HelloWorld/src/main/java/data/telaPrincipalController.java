package data;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class telaPrincipalController {
    
    @FXML
    private TextField textEntrada;

    @FXML
    private TextField textSaida;
    
    @FXML
    private void processar() {
        textSaida.setText(textEntrada.getText());
    }
    
    @FXML
    private void limpar() {
        textEntrada.setText("");
        textSaida.setText("");
    }
    
    @FXML
    private void sair() {
        System.exit(0);
    }
}
