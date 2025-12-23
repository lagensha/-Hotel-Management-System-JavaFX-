package org.customer.model.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class CustomerInfoDTO {
    private String customerId;
    private String customerName;
    private String customerPhoneNumber;
    private String customerCity;
    private String customerAge;


}
