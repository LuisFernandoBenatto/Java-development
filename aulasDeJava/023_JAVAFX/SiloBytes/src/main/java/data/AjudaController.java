package data;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class AjudaController { 
    @FXML
    private void voltar() throws IOException{
        App.setRoot("menu");
    } 
    @FXML
    private void fechar(){
        System.exit(0); 
    } 
}
