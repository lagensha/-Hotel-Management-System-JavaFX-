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
import org.customer.model.dto.CustomerInfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerDetails_form_controller implements Initializable {
ObservableList<CustomerInfoDTO>customerInfoDTOS= FXCollections.observableArrayList(
        new CustomerInfoDTO("C0001", "Jenny Dela", "1234567890", "Japan", "26"),
        new CustomerInfoDTO("C0002", "Laly Lisa", "0987654321", "South Korea", "29"),
        new CustomerInfoDTO("C0003", "Alice pashel", "888555555","Chicago" , "45"),
        new CustomerInfoDTO("C0004", "Bob Brown", "412444496663", "Los Angeles", "25"),
        new CustomerInfoDTO("C0005", "Charlot Davis", "8990757643", "USA", "30")
);
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    colCustomerId.setCellValueFactory(new PropertyValueFactory<>("customerId"));
    colCustomerName.setCellValueFactory(new PropertyValueFactory<>("customerName"));
    ColPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("customerPhoneNumber"));
    colAge.setCellValueFactory(new PropertyValueFactory<>("customerAge"));
    colCity.setCellValueFactory(new PropertyValueFactory<>("customerCity"));
    tblCustomerInfo.setItems(customerInfoDTOS);

    tblCustomerInfo.getSelectionModel().selectedItemProperty().addListener((observable ,oldValue , newValue) ->{
        if(newValue != null){
            txtCustomerId.setText(newValue.getCustomerId());
            txtCustomerName.setText(newValue.getCustomerName());
            txtCustomerPhoneNUmber.setText(newValue.getCustomerPhoneNumber());
            txtCity.setText(newValue.getCustomerCity());
            txtAge.setText(String.valueOf(newValue.getCustomerAge()));
        }
    });
    }
    @FXML
    private TableColumn<?, ?> ColPhoneNumber;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> colAge;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colCustomerId;

    @FXML
    private TableColumn<?, ?> colCustomerName;

    @FXML
    private TableView<CustomerInfoDTO> tblCustomerInfo;

    @FXML
    private TextField txtAge;

    @FXML
    private TextField txtCity;

    @FXML
    private TextField txtCustomerId;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField txtCustomerPhoneNUmber;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String customerID=txtCustomerId.getText();
        String customerName=txtCustomerName.getText();
        String customerPhoneNumber=txtCustomerPhoneNUmber.getText();
        String customerCity=txtCity.getText();
        String customerAge= String.valueOf(Integer.parseInt(txtAge.getText()));

        CustomerInfoDTO customerInfoDTO=new CustomerInfoDTO(customerID,customerName,customerPhoneNumber,customerCity,customerAge);
        customerInfoDTOS.add(customerInfoDTO);

        clearTextField();
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        CustomerInfoDTO deleteInfoDTO=tblCustomerInfo.getSelectionModel().getSelectedItem();
        customerInfoDTOS.remove(deleteInfoDTO);

        clearTextField();
    }

    @FXML
    void btnResetOnAction(ActionEvent event) {
        clearTextField();
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        CustomerInfoDTO updateInfoDTO=tblCustomerInfo.getSelectionModel().getSelectedItem();
            updateInfoDTO.setCustomerId(txtCustomerId.getText());
            updateInfoDTO.setCustomerName(txtCustomerName.getText());
            updateInfoDTO.setCustomerPhoneNumber(txtCustomerPhoneNUmber.getText());
            updateInfoDTO.setCustomerCity(txtCity.getText());
            updateInfoDTO.setCustomerAge(txtAge.getText());
            tblCustomerInfo.refresh();
        clearTextField();


    }
    public void clearTextField(){
        txtCustomerId.clear();
        txtCity.clear();
        txtAge.clear();
        txtCustomerName.clear();
        txtCustomerPhoneNUmber.clear();

    }
}
