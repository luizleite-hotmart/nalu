package com.luizleiteolveira.nalu.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "scenario")
public class Scenario implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "base_scenario")
    private Boolean baseScenario = Boolean.FALSE;
    @Column(name = "description")
    private String description;
    @NotNull
    @JoinColumn(name = "feature_id", nullable = false)
    private Feature feature;
    @OneToMany(mappedBy = "scenario", cascade = CascadeType.ALL)
    private List<ScenarioAtribute> scenarioAtributeList;
}
