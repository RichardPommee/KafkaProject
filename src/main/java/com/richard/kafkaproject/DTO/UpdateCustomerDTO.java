package com.richard.kafkaproject.DTO;

import com.richard.kafkaproject.model.Pensionprovider;
import lombok.Data;

@Data
public class UpdateCustomerDTO {

    Long id;
    String address;
    String maritualstatus;
    Pensionprovider pensionprovider;

}
