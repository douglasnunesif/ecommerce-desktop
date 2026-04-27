package br.edu.tds.telalogin;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaLoginController {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtSenha;
    @FXML
    private Label lblUsuario;
    @FXML
    private Label lblSenha;

    @FXML
    private void abrirTelaCadastroUsuario() throws IOException {
        App.setRoot("telaCadastroUsuario");
    }

    @FXML
    private void realizarLogin() throws IOException {

        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();

        if (usuario.isEmpty() && senha.isEmpty()) {
            lblUsuario.setText("* Campo usuário é obrigatório");
            lblSenha.setText("* Campo senha é obrigatório");
            System.out.println("Campo usuário e campo senha são obrigatórios");
            return;
        }

        if (usuario.isEmpty()) {
            lblUsuario.setText("* Campo usuário é obrigatório");
            lblSenha.setText("");
            System.out.println("Campo usuário é obrigatório");
            return;
        }
        if (senha.isEmpty()) {
            lblUsuario.setText("");
            lblSenha.setText("* Campo senha é obrigatório");
            System.out.println("Campo senha é obrigatório");
            return;
        }

        lblUsuario.setText("");
        lblSenha.setText("");

        UsuarioDAO dao = new UsuarioDAO();
        Boolean login = dao.login(usuario, senha);
       

        if (login) {
            //Login com sucesso
            System.out.println("Login feito");
            App.setRoot("telaGerenciamentoUsuarios");
        } else {
            //Falha no login (usuário ou senha inválido)
            lblUsuario.setText("Usuário/Senha incorreto(a)");
            lblSenha.setText("Usuário/Senha incorreto(a)");
            System.out.println("Falha no login");
        }

        System.out.println("Usuário: " + usuario);
        System.out.println("Senha  : " + senha);

    }

}
