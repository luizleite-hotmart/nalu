package com.luizleiteolveira.nalu;

import com.luizleiteolveira.nalu.entity.FeatureAttribute;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FieldsTesting {

    @Test
    public void fieldTypeGet() {
        FeatureAttribute featureAttribute = new FeatureAttribute();
        featureAttribute.setType(Long.class);
        Assert.assertTrue("Get attribute should return expect type", Long.class.equals(featureAttribute.getType()));
    }

}
