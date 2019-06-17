package uk.co.rowney.esrdapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SpellCasting {

    //todo add information on spell slots known etc etc

    //This refers to spells class can learn by each level
    private List<Spell> firstLevelSpells;
    private List<Spell> secondLevelSpells;
    private List<Spell> thirdLevelSpells;
    private List<Spell> fourthLevelSpells;
    private List<Spell> fifthLevelSpells;
    private List<Spell> sixthLevelSpells;
    private List<Spell> seventhLevelSpells;
    private List<Spell> eighthLevelSpells;
    private List<Spell> ninthLevelSpells;

}
