package entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Scenario implements Serializable {

    private Long id;
    private String description;

}
