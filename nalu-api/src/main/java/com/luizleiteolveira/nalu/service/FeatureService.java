package com.luizleiteolveira.nalu.service;


import com.luizleiteolveira.nalu.repository.FeatureRepository;
import com.luizleiteolveira.nalu.repository.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

    @Autowired
    private ScenarioRepository scenarioRepository;

}
