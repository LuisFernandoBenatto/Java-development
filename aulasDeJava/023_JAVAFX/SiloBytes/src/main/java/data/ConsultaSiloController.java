package data;

import data.modelo.Armazenagem;
import data.util.ArquivoSilo;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class ConsultaSiloController {
    
    ArrayList<Armazenagem> lista = ArquivoSilo.listar();
    int pos = -1;
    
    @FXML
    private TextField campoEndereco;

    @FXML
    private Slider sliderCapacidade;

    @FXML
    private CheckBox checkAlugado;

    @FXML
    private Slider sliderDisponivel;

//    @FXML
//    private Button btnProximo;
//
//    @FXML
//    private Button btnAnterior;
    
    @FXML
    public void initialize(){
        this.proximoSilo();
        this.campoEndereco.setEditable(false);
        this.sliderCapacidade.setDisable(true);
        this.sliderDisponivel.setDisable(true);
    }
    
    @FXML
    public void proximoSilo(){
        try {
            this.setPos(this.getPos() + 1);
            campoEndereco.setText(this.lista.get(this.pos).getEndereco());
            sliderCapacidade.setValue(this.lista.get(this.pos).getCapacidade());
            sliderDisponivel.setValue(this.lista.get(this.pos).getDisponivel());
            checkAlugado.setSelected(this.lista.get(this.pos).getAlugado());
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }
    
    @FXML
    public void siloAnterior(){
        try {
            this.setPos(this.getPos() - 1);
            campoEndereco.setText(this.lista.get(this.pos).getEndereco());
            sliderCapacidade.setValue(this.lista.get(this.pos).getCapacidade());
            sliderDisponivel.setValue(this.lista.get(this.pos).getDisponivel());
            checkAlugado.setSelected(this.lista.get(this.pos).getAlugado());
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    } 
}
