package com.luizleiteolveira.nalu.vo.request.response;

import com.luizleiteolveira.nalu.entity.Feature;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FeatureResponseVO implements Serializable {

    private Long id;
    private String description;
    private String urlForTest;

    public FeatureResponseVO(Feature feature) {
        this.id = feature.getId();
        this.description = feature.getDescription();
        this.urlForTest = feature.getUrlForTest();
    }
}
