package com.richard.kafkaproject.controller;

import com.richard.kafkaproject.DTO.UpdateCustomerDTO;
import com.richard.kafkaproject.model.Customer;
import com.richard.kafkaproject.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("government")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping(path = "/getpersonaldata", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> findAll(){
        return new ResponseEntity<List<Customer>>(customerService.findAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/insertpersonaldata")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.OK);
    }

    @PutMapping(path = "/updatepersonaldata")
    public void updateCustomer(@RequestBody UpdateCustomerDTO updateCustomerDTO){
        customerService.update(updateCustomerDTO);
    }

}
