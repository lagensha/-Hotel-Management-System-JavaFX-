package org.customer.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class login_form_controller {
    public TextField txtUserName;
    public PasswordField txtPassword;
    Stage stage = new Stage();
    public void btnLogonOnAction(ActionEvent actionEvent) {
        String username= txtUserName.getText();
        String password= txtPassword.getText();
        if(username.equals("Admin@123")){

        }
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Customer_login_form.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
}
