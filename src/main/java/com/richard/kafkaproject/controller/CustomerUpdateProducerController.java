package com.richard.kafkaproject.controller;

import com.richard.kafkaproject.DTO.UpdateCustomerDTO;
import com.richard.kafkaproject.service.CustomerUpdateProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
public class CustomerUpdateProducerController {

    private final CustomerUpdateProducerService customerUpdateProducerService;

    @PutMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody UpdateCustomerDTO updateCustomerDTO) {
        this.customerUpdateProducerService.sendMessage(updateCustomerDTO);
    }
}
