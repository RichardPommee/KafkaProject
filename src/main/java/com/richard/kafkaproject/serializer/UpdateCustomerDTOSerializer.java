package com.richard.kafkaproject.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.richard.kafkaproject.DTO.UpdateCustomerDTO;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class UpdateCustomerDTOSerializer implements Serializer<UpdateCustomerDTO> {

    @Override public void configure(Map<String, ?> map, boolean b) {
    }

    @Override
    public byte[] serialize(String arg0, UpdateCustomerDTO arg1) {
        byte[] retVal = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            retVal = objectMapper.writeValueAsString(arg1).getBytes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }

    @Override public void close() {
    }
}
