package uk.co.rowney.esrdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PlayerSkill {
    private Skill skill;
    private String skillAttribute;
    private boolean skillProficiency = false;
    private boolean skillExpertise = false;
    private int skillOtherModifier = 0; // i.e jack of all trades other bonuses
    private int skillValue = 0;
}

//todo this will be used for character sheets currently no implemented
