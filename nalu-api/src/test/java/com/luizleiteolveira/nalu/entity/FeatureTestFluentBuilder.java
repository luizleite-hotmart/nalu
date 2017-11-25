package com.luizleiteolveira.nalu.entity;

public class FeatureTestFluentBuilder {

    private final Feature feature;

    private FeatureTestFluentBuilder() {
        feature = new Feature();
    }

    public static FeatureTestFluentBuilder featureBuilder() {
        return new FeatureTestFluentBuilder();
    }

    public FeatureTestFluentBuilder withDescription(String description) {
        feature.setDescription(description);
        return this;
    }

    public FeatureTestFluentBuilder withUrlForTest(String urlForTest) {
        feature.setUrlForTest(urlForTest);
        return this;
    }

}
