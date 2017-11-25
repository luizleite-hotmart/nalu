package com.luizleiteolveira.nalu.vo.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FeatureRequestVO implements Serializable{

    private Long id;
    private String description;
    private String urlForTest;
    private Boolean active = Boolean.FALSE;

}
