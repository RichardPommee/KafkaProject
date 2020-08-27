package com.richard.kafkaproject.service;

import com.richard.kafkaproject.DTO.UpdateCustomerDTO;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerUpdateProducerService {
    private static final Logger logger = LoggerFactory.getLogger(Producer.class);
    private static final String TOPIC = "CustomerUpdate";

    @Autowired
    private KafkaTemplate<String, UpdateCustomerDTO> kafkaTemplate;

    public void sendMessage(UpdateCustomerDTO updateCustomerDTO) {
        logger.info(String.format("#### -> Producing message -> %s", updateCustomerDTO));
        this.kafkaTemplate.send(TOPIC, updateCustomerDTO);
    }
}
