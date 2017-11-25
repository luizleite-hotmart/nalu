package com.luizleiteolveira.nalu.repository;

import com.luizleiteolveira.nalu.entity.Feature;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FeatureRepository extends PagingAndSortingRepository<Feature, Long> {

    List<Feature> findAllByActiveIsTrue();
}

