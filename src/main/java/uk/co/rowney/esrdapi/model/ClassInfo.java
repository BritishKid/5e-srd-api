package uk.co.rowney.esrdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ClassInfo {
    private String className;
    private String hitDice;
    private boolean spellCaster;
    private Proficiencies proficiencies;
    private StartingGear startingGear;
    private List<Archetype> archetypes;
    private List<ClassFeature> classFeatures;
    private List<SpellCasting> spellCasting;
}
