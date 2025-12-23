package org.customer.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class login_form_controller {
    public TextField txtUserName;
    public PasswordField txtPassword;
    Stage stage = new Stage();

    public void btnLogonOnAction(ActionEvent actionEvent) {
        String username = txtUserName.getText();
        String password = txtPassword.getText();
        if (username.equals("Admin@123") || password.equals("Admin123")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid UserName or Password");

            alert.showAndWait();

        }else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Thank you for joining with us !");
            alert.showAndWait();
            cleartext();
        }
    }
    public void cleartext(){
        txtPassword.clear();
        txtUserName.clear();
    }
}