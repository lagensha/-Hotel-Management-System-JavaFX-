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
    ObservableList<RoomInfoDTO> roomInfoDTOS = FXCollections.observableArrayList(
            new RoomInfoDTO("R0001", "C0001", 70000.00, "0774655146"),
            new RoomInfoDTO("R0002", "C0002", 67000.00, "0776845123"),
            new RoomInfoDTO("R0003", "C0003", 55000.00, "0709923145"),
            new RoomInfoDTO("R0004", "C0004", 90000.00, "0777904324")
    );

    public TableColumn colRoomId;
    public TableColumn colCustomerId;
    public TableColumn colCustomerPhoneNumber;
    public TableColumn colPrice;
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableView<RoomInfoDTO> tblRoomDetails;

    @FXML
    private TextField txtCustomerPhonenumber;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtcustomerId;

    @FXML
    private TextField txtroomId;


    @FXML
    void btnAddOnAction(ActionEvent event) {
        String roomId=txtroomId.getText();
        String customerId=txtcustomerId.getText();
        String customerPhoneNumber=txtCustomerPhonenumber.getText();
        double price=Double.parseDouble(txtPrice.getText());

        RoomInfoDTO roominfoDTO=new RoomInfoDTO(roomId,customerId,price,customerPhoneNumber);
        roomInfoDTOS.add(roominfoDTO);
        clearText();

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        RoomInfoDTO deletRoomInfoDTO=tblRoomDetails.getSelectionModel().getSelectedItem();
        roomInfoDTOS.remove(deletRoomInfoDTO);
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        RoomInfoDTO updateRoomInfoDTO=tblRoomDetails.getSelectionModel().getSelectedItem();

        updateRoomInfoDTO.setRoomId(txtroomId.getText());
        updateRoomInfoDTO.setCustomerId(txtcustomerId.getText());
       updateRoomInfoDTO.setPrice(Double.parseDouble(txtPrice.getText()));
        updateRoomInfoDTO.setCustomerPhoneNumber(txtCustomerPhonenumber.getText());
        tblRoomDetails.refresh();
        clearText();
    }

    @FXML
    void txtCustomerPhonenumberOnAction(ActionEvent event) {

    }

    @FXML
    void txtPriceOnAction(ActionEvent event) {

    }

    @FXML
    void txtcustomerIdOnAction(ActionEvent event) {

    }

    @FXML
    void txtroomIdOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colRoomId.setCellValueFactory(new PropertyValueFactory<>("roomId"));
        colCustomerId.setCellValueFactory(new PropertyValueFactory<>("customerId"));
        colCustomerPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("customerPhoneNumber"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("Price"));
        tblRoomDetails.setItems(roomInfoDTOS);

        tblRoomDetails.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) ->{
            if (newValue != null){
                txtroomId.setText(newValue.getRoomId());
                txtcustomerId.setText(newValue.getCustomerId());
                txtCustomerPhonenumber.setText(newValue.getCustomerPhoneNumber());
                txtPrice.setText(String.valueOf(newValue.getPrice()));
            }
        });


    }

    public void btnResetOnAction(ActionEvent actionEvent) {
        clearText();
    }
    public  void clearText(){
        txtcustomerId.clear();
        txtroomId.clear();
        txtCustomerPhonenumber.clear();
        txtPrice.clear();
    }
}

