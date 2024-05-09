package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

//classe que controla a tela - controller
public class ViewController {

    //atributo que corresponde ao controle desejado
    @FXML
    private Label welcomeText;

    //o que acontece ao clicar no botão
    @FXML           //de preferencia:  on + nome do atributo + ação
    protected void onHelloButtonClick() {  //onHelloButtonClick  - on action / scenebuilder
        Alerts.showAlert("Alert Title", null, "OIIII", Alert.AlertType.INFORMATION);
    }
}