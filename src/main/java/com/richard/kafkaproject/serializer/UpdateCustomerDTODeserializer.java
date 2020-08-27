package com.richard.kafkaproject.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.richard.kafkaproject.DTO.UpdateCustomerDTO;
import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public class UpdateCustomerDTODeserializer implements Deserializer<UpdateCustomerDTO> {

    @Override public void close() {
    }
    @Override public void configure(Map<String, ?> arg0, boolean arg1) {
    }
    @Override
    public UpdateCustomerDTO deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        UpdateCustomerDTO updateCustomerDTO = null;
        try {
            updateCustomerDTO = mapper.readValue(arg1, UpdateCustomerDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updateCustomerDTO;
    }

}
