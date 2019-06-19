package uk.co.rowney.esrdapi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class StartingGear {
    private Map<String, Integer> classStartingWeapon;
    private Map<String, Integer>  classStartingEquipment;
    private Map<String, Integer>  classStartingArmour;
}
