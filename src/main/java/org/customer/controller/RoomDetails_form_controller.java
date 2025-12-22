package org.customer.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.customer.model.dto.RoomInfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class RoomDetails_form_controller implements Initializable {
    public Button btnAdd;
    public Button btnDelete;
    public Button btnUpdate;
    public TextField txtRoomId;
    public TextField txtCustomerId;
    public TextField customerphonenumber;
    public TextField txtCustomerName;
    public TextField txtCustomerphonenumber;
    ObservableList<RoomInfoDTO>roomInfoDTOS = FXCollections.observableArrayList(
            new RoomInfoDTO("R0001","C0001","Kamala Perera","0774655146"),
            new RoomInfoDTO("R0002","C0002","Vimala Sumanasinghe","0776845123"),
            new RoomInfoDTO("R0003","C0003","Lily Geheragama","0709923145"),
            new RoomInfoDTO("R0004","C0004","Nimal Amarasekara","0777904324")
    );
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
    private TableView<RoomInfoDTO> tblRoomDetails;

    @FXML
    void btnResetOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colRoomId.setCellValueFactory(new PropertyValueFactory<>("roomId"));
        colCustomerId.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        colCustomerName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("customerPhoneNumber"));

        tblRoomDetails.setItems(roomInfoDTOS);
    }

    public void btnAddtOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
}