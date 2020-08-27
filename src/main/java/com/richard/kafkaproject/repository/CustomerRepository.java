package com.richard.kafkaproject.repository;

import com.richard.kafkaproject.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
