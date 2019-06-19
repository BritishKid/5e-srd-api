package uk.co.rowney.esrdapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Background {

    private Proficiencies proficiencies;
    private List<String> startingEquipment;
    private Map<Integer, String> definingEvent;
    private String feature;
    private Map<Integer, String> personalityTrait;
    private Map<Integer, String> ideal;
    private Map<Integer, String> bond;
    private Map<Integer, String> flaw;
}
