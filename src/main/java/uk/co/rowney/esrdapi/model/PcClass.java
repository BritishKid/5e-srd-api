package uk.co.rowney.esrdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PcClass {
    private String className;
    private String hitDice;
    private boolean spellCaster;
    private Proficiencies proficiencies;
    private List<Weapon> classStartingWeapon;
    private List<Equipment> classStartingEquipment;
    private List<Armour> classStartingArmour;
    private List<Archetype> archetypes;
    private List<ClassFeature> classFeatures;
    private List<SpellCasting> spellCasting;
}
