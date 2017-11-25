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
import java.util.ArrayList;
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
        List<FeatureResponseVO> featureResponseVOList = converListOfFeaturesInResponseVO(featureList);
        return featureResponseVOList;
    }

    private List<FeatureResponseVO> converListOfFeaturesInResponseVO (List<Feature> featureList) {
        List<FeatureResponseVO> featureResponseVOList = new ArrayList<>();
        featureList.forEach(feature -> {
            featureResponseVOList.add(new FeatureResponseVO(feature));
        });
        return featureResponseVOList;
    }


}
