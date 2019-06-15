package uk.co.rowney.esrdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Archetype {
    private String name;
    private String description;
    private List<ClassFeature> features;
}
