package org.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

//classe que controla a tela - controller
public class ViewController {

    //atributo que corresponde ao controle desejado
    @FXML
    private Label welcomeText;

    //o que acontece ao clicar no botão
    @FXML           //de preferencia:  on + nome do atributo + ação
    protected void onHelloButtonClick() {  //onHelloButtonClick  - on action / scenebuilder
        welcomeText.setText("Olá, Tayna!");
        //System.out.println("Ola yasmin");
    }
}