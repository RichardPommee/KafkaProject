package com.richard.kafkaproject.service;

import com.richard.kafkaproject.DTO.UpdateCustomerDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class CustomerUpdateConsumerService {

    private final Logger logger = LoggerFactory.getLogger(CustomerUpdateProducerService.class);
    final CustomerService customerService;

    @KafkaListener(topics = "CustomerUpdate", groupId = "group_id")
    public void consume(UpdateCustomerDTO updateCustomerDTO) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", updateCustomerDTO));
        customerService.update(updateCustomerDTO);
    }

}
