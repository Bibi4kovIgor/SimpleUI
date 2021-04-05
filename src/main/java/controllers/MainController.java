package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    public Button button1;
    @FXML
    public TextArea textArea1;

    public void clickEvent(ActionEvent actionEvent) {
        textArea1.setText("Text, text, text...");
    }
}
