package uk.co.rowney.esrdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Proficiencies {

    private int skillChoice;
    private List<String> skillList;
    private List<String> armour;
    private List<String> weapons;
    private List<String> tools;

}
