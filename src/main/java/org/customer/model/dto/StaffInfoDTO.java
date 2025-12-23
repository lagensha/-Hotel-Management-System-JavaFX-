package org.customer.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
public class StaffInfoDTO {
    private String staffId;
    private  String name;
    private String role;
    private String email;
    private String phoneNumber;
    private double salary;
}
