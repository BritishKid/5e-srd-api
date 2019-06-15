package uk.co.rowney.esrdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClassFeature {
    private String name;
    private String description; //todo maybe create into a generic object
    private int levelUnlocked;
}
