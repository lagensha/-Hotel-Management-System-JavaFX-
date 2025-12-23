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
import org.customer.model.dto.StaffInfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class StaffDetails_controller implements Initializable {
    ObservableList<StaffInfoDTO>staffInfoDTOS= FXCollections.observableArrayList(
            new StaffInfoDTO("S002", "Nimali Fernando", "Housekeeping Supervisor", "nimali.fernando@hotel.com", "0719876543", 65000.00),
            new StaffInfoDTO("S003", "Ruwan Silva", "Hotel Manager", "ruwan.silva@hotel.com", "0764455667", 150000.00),
            new StaffInfoDTO("S004", "Saman Jayasinghe", "Chef", "saman.j@hotel.com", "0753344556", 90000.00),
            new StaffInfoDTO("S005", "Tharushi Perera", "Receptionist", "tharushi.p@hotel.com", "0789988776", 60000.00)

    );
    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPhoneNumber;

    @FXML
    private TableColumn<?, ?> colRole;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableColumn<?, ?> colStaffId;

    @FXML
    private TableView<StaffInfoDTO> tblStaffinfo;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    private TextField txtRole;

    @FXML
    private TextField txtSalary;

    @FXML
    private TextField txtStaffId;

    @FXML
    void btnAddOnAction(ActionEvent event) {
            String Id=txtStaffId.getText();
            String name=txtName.getText();
            String phonenumber=txtPhoneNumber.getText();
            String role=txtRole.getText();
            String email=txtEmail.getText();
            double salary=Double.parseDouble(txtSalary.getText());

            StaffInfoDTO addStaffInfoDTO= new StaffInfoDTO(Id,name,phonenumber,role,email,salary);
            staffInfoDTOS.add(addStaffInfoDTO);
        clearText();
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        StaffInfoDTO deleteStaffInfoDTO=tblStaffinfo.getSelectionModel().getSelectedItem();
        staffInfoDTOS.remove(deleteStaffInfoDTO);
        clearText();
    }

    @FXML
    void btnResetOnAction(ActionEvent event) {
        clearText();

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        StaffInfoDTO updatestaffInfoDTO=tblStaffinfo.getSelectionModel().getSelectedItem();
        updatestaffInfoDTO.setStaffId(txtStaffId.getText());
        updatestaffInfoDTO.setName(txtName.getText());
        updatestaffInfoDTO.setPhoneNumber(txtPhoneNumber.getText());
        updatestaffInfoDTO.setRole(txtRole.getText());
        updatestaffInfoDTO.setEmail(txtEmail.getText());
        updatestaffInfoDTO.setSalary(Double.parseDouble(txtSalary.getText()));
        tblStaffinfo.refresh();
        clearText();
    }

    @FXML
    void txtEmailOnAction(ActionEvent event) {

    }

    @FXML
    void txtNameOnAction(ActionEvent event) {

    }

    @FXML
    void txtPhoneNumberOnAction(ActionEvent event) {

    }

    @FXML
    void txtRoleOnAction(ActionEvent event) {

    }

    @FXML
    void txtSalaryOnAction(ActionEvent event) {

    }

    @FXML
    void txtStaffIdOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colStaffId.setCellValueFactory(new PropertyValueFactory<>("staffId"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        tblStaffinfo.setItems(staffInfoDTOS);

        tblStaffinfo.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue,newValue) -> {
            if(newValue != null){
                txtStaffId.setText(newValue.getStaffId());
                txtName.setText(newValue.getName());
                txtPhoneNumber.setText(newValue.getPhoneNumber());
                txtRole.setText(newValue.getRole());
                txtEmail.setText(newValue.getEmail());
                txtSalary.setText(String.valueOf(newValue.getSalary()));

            }
        });

    }
     public void clearText(){
        txtStaffId.clear();
        txtName.clear();
        txtPhoneNumber.clear();
        txtRole.clear();
        txtEmail.clear();
        txtSalary.clear();
     }
}
