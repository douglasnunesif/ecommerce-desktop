package br.edu.tds.telalogin;

import java.io.IOException;
import javafx.fxml.FXML;

public class TelaLoginController {

    @FXML
    private void abrirTelaCadastroUsuario() throws IOException {
        App.setRoot("telaCadastroUsuario");
    }
}
