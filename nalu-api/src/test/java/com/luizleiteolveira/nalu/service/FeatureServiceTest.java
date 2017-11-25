package com.luizleiteolveira.nalu.service;

import com.luizleiteolveira.nalu.entity.Feature;
import com.luizleiteolveira.nalu.repository.FeatureRepository;
import com.luizleiteolveira.nalu.vo.response.FeatureResponseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static com.luizleiteolveira.nalu.entity.FeatureTestFluentBuilder.featureBuilder;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FeatureServiceTest {

    @InjectMocks
    private FeatureService featureService;

    @Mock
    private FeatureRepository featureRepository;

    @Test
    public void findActiveFeatures() {
        Feature feature = featureBuilder()
                            .withDescription("feature")
                            .withUrlForTest("http://google.com")
                            .build();
        Feature feature1 = featureBuilder()
                                .withDescription("feature1")
                                .withUrlForTest("http://yahoo.com")
                                .build();
        List<Feature> listFeature = new ArrayList<>();
        listFeature.add(feature);
        listFeature.add(feature1);
        when(featureRepository.findAllByActiveIsTrue()).thenReturn(listFeature);
        List<FeatureResponseVO> result = featureService.findActiveFeatures();
        assertTrue("Size from returned list should be equals 2",
                listFeature.size() == result.size());
        assertTrue(listFeature.get(0).getDescription().equals(result.get(0).getDescription()));
    }
}