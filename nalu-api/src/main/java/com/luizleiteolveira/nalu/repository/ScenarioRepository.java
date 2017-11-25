package com.luizleiteolveira.nalu.repository;

import com.luizleiteolveira.nalu.entity.Feature;
import com.luizleiteolveira.nalu.entity.Scenario;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ScenarioRepository extends PagingAndSortingRepository<Scenario, Long> {

    List<Scenario> findAllByFeature(Feature feature);
}
