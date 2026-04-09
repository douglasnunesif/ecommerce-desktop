/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.tds.telalogin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author douglas
 */
public class TelaCadastroUsuarioController implements Initializable {

    @FXML
    private TextField txtNomeCompleto;
    @FXML
    private TextField txtNomeUsuario;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtCPF;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void abrirTelaLogin() throws IOException {
        App.setRoot("telaLogin");
    }

    @FXML
    private void cadastrarUsuario() {

        String nomeCompleto = txtNomeCompleto.getText();
        String nomeUsuario = txtNomeUsuario.getText();
        String senha = txtSenha.getText();
        String email = txtEmail.getText();
        String cpf = txtCPF.getText();

        txtNomeCompleto.setStyle("-fx-background-color: transparent; -fx-border-color: #0598ff; -fx-border-width: 0 0 3 0;");
        txtNomeUsuario.setStyle("-fx-background-color: transparent; -fx-border-color: #0598ff; -fx-border-width: 0 0 3 0;");
        txtSenha.setStyle("-fx-background-color: transparent; -fx-border-color: #0598ff; -fx-border-width: 0 0 3 0;");
        txtEmail.setStyle("-fx-background-color: transparent; -fx-border-color: #0598ff; -fx-border-width: 0 0 3 0;");
        txtCPF.setStyle("-fx-background-color: transparent; -fx-border-color: #0598ff; -fx-border-width: 0 0 3 0;");

        if (nomeCompleto.isEmpty()) {
            txtNomeCompleto.setStyle("-fx-background-color: transparent; -fx-border-color: red; -fx-border-width: 0 0 3 0;");
        }
        if (nomeUsuario.isEmpty()) {
            txtNomeUsuario.setStyle("-fx-background-color: transparent; -fx-border-color: red; -fx-border-width: 0 0 3 0;");
        }
        if (senha.isEmpty()) {
            txtSenha.setStyle("-fx-background-color: transparent; -fx-border-color: red; -fx-border-width: 0 0 3 0;");
        }
        if (email.isEmpty()) {
            txtEmail.setStyle("-fx-background-color: transparent; -fx-border-color: red; -fx-border-width: 0 0 3 0;");
        }
        if (cpf.isEmpty()) {
            txtCPF.setStyle("-fx-background-color: transparent; -fx-border-color: red; -fx-border-width: 0 0 3 0;");
        }

        if (!(nomeCompleto.isEmpty() || nomeUsuario.isEmpty() || senha.isEmpty() || email.isEmpty() || cpf.isEmpty())) {
            //Cadastrando um usuário no BD
            UsuarioDAO dao = new UsuarioDAO();
            Usuario u = new Usuario(nomeCompleto, nomeUsuario, email, senha, cpf);
            dao.cadastrar(u);
        }

    }
}
