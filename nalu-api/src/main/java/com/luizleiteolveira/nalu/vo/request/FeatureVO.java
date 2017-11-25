package com.luizleiteolveira.nalu.vo.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class FeatureVO implements Serializable{

    private Long id;
    private String description;
    private String urlForTest;

}
