package org.customer.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RoomDetails_form_controller {

    @FXML
    private Button btnRest;

    @FXML
    private TableColumn<?, ?> colCustomerId;

    @FXML
    private TableColumn<?, ?> colCustomerName;

    @FXML
    private TableColumn<?, ?> colPhoneNumber;

    @FXML
    private TableColumn<?, ?> colRoomId;

    @FXML
    private TableView<?> tblRoomDetails;

    @FXML
    void btnResetOnAction(ActionEvent event) {

    }

}
