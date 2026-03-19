package br.edu.tds.telalogin;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaLoginController {
    
    @FXML
    private TextField txtUsuario;
    @FXML 
    private PasswordField txtSenha;
    
       
    @FXML
    private void abrirTelaCadastroUsuario() throws IOException {
        App.setRoot("telaCadastroUsuario");
    }
    
    @FXML
    private void realizarLogin(){
       
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        
        if(usuario.isEmpty()){
            System.out.println("Campo usuário é obrigatório");
            return;
        }
        if(senha.isEmpty()){
            System.out.println("Campo senha é obrigatório");
            return;
        }
        
        System.out.println("Usuário: " + usuario);
        System.out.println("Senha  : " + senha);
        
        
    }
    
}
