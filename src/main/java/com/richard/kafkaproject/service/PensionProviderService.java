package com.richard.kafkaproject.service;

import com.richard.kafkaproject.model.Pensionprovider;
import com.richard.kafkaproject.repository.PensionProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PensionProviderService {

    private final PensionProviderRepository pensionProviderRepository;

    public void save(Pensionprovider pensionprovider){
        pensionProviderRepository.save(pensionprovider);
    }
}
