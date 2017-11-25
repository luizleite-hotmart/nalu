package com.luizleiteolveira.nalu.entity;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "feature")
public class Feature implements Serializable{

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "description", nullable = false)
    private String description;
    @NotNull
    @URL
    @Column(name = "url_for_test")
    private String urlForTest;

    @OneToMany(mappedBy = "feature", cascade = CascadeType.ALL)
    private List<FeatureAttribute> attributeList;

}
