package org.customer.model.dto;

public class RoomInfoDTO {
    private String roomId;
    private String customerId;
    private double Price;
    private String customerPhoneNumber;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }


    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public RoomInfoDTO(String roomId, String customerId, double price, String customerPhoneNumber) {
        this.roomId = roomId;
        this.customerId = customerId;
        Price = price;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    @Override
    public String toString() {
        return "RoomInfoDTO{" +
                "roomId='" + roomId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", Price=" + Price +
                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                '}';
    }
}
