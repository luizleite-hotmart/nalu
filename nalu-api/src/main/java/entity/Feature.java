package entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Feature implements Serializable{

    private Long id;
    private String description;
    private List<Scenario> scenarios;

}
