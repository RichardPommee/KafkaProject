package com.richard.kafkaproject.service;

import com.richard.kafkaproject.DTO.UpdateCustomerDTO;
import com.richard.kafkaproject.model.Customer;
import com.richard.kafkaproject.model.Pensionprovider;
import com.richard.kafkaproject.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Component
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final PensionProviderService pensionProviderService;

    public List<Customer> findAll(){
        return StreamSupport.stream(customerRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Customer save(Customer customer){
        pensionProviderService.save(customer.getPensionprovider());
        return customerRepository.save(customer);
    }

    public Optional<Customer> findById(Long id){
        return customerRepository.findById(id);
    }

    public void update(UpdateCustomerDTO updateCustomerDTO){
        Customer updateCustomer = customerRepository.findById(updateCustomerDTO.getId()).get();
        updateCustomer.setAddress(updateCustomerDTO.getAddress());
        updateCustomer.setMaritualstatus(updateCustomerDTO.getMaritualstatus());
        updateCustomer.setPensionprovider(updateCustomerDTO.getPensionprovider());
        customerRepository.save(updateCustomer);
    }

}
