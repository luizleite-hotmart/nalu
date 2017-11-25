package com.luizleiteolveira.nalu.service;


import com.luizleiteolveira.nalu.entity.Feature;
import com.luizleiteolveira.nalu.repository.FeatureRepository;
import com.luizleiteolveira.nalu.vo.request.FeatureRequestVO;
import com.luizleiteolveira.nalu.vo.response.FeatureResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeatureService {

    @Autowired
    private FeatureRepository featureRepository;

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

    public FeatureResponseVO saveOrUpdateFeature(FeatureRequestVO featureRequestVO) {
        Feature feature = null;
        if (featureRequestVO.getId() != null) {
            feature = featureRepository.findOne(featureRequestVO.getId());
        } else {
            feature = new Feature();
        }

        feature.setUrlForTest(featureRequestVO.getUrlForTest());
        feature.setDescription(featureRequestVO.getDescription());
        feature.setActive(featureRequestVO.getActive());
        feature = featureRepository.save(feature);
        return new FeatureResponseVO(feature);
    }


}
