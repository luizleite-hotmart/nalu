package com.luizleiteolveira.nalu.service;


import com.luizleiteolveira.nalu.entity.Feature;
import com.luizleiteolveira.nalu.repository.FeatureRepository;
import com.luizleiteolveira.nalu.repository.ScenarioRepository;
import com.luizleiteolveira.nalu.vo.response.FeatureResponseVO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

    @Autowired
    private ScenarioRepository scenarioRepository;

    @Autowired
    private ModelMapper mapper;

    public List<FeatureResponseVO> findActiveFeatures() {
        List<Feature> featureList = featureRepository.findAllByActiveIsTrue();
        Type targetListType = new TypeToken<List<FeatureResponseVO>>() {}.getType();
        List<FeatureResponseVO> featureResponseVOList = mapper.map(featureList, targetListType);
        return featureResponseVOList;
    }

}
