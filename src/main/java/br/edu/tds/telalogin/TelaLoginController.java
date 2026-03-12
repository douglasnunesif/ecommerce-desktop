package br.edu.tds.telalogin;

import java.io.IOException;
import javafx.fxml.FXML;

public class TelaLoginController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
