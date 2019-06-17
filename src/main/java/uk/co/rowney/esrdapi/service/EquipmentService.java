package uk.co.rowney.esrdapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rowney.esrdapi.dao.EquipmentJsonReader;
import uk.co.rowney.esrdapi.model.Armour;
import uk.co.rowney.esrdapi.model.Equipment;
import uk.co.rowney.esrdapi.model.Weapon;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentJsonReader equipmentJsonReader;

    public Map<Integer, String> getAllEquipment() throws FileNotFoundException {
        List<Equipment> allEquipment = equipmentJsonReader.getAllEquipment();
        Map<Integer, String> equipmentMap = new HashMap<>();

        for (Equipment equipment: allEquipment) {
            equipmentMap.put(equipment.getId(), equipment.getName());
        }

        return equipmentMap;
    }

    public Map<Integer, String> getAllArmour() throws FileNotFoundException {
        List<Armour> allArmour = equipmentJsonReader.getAllArmour();
        Map<Integer, String> armourMap = new HashMap<>();

        for (Armour armour: allArmour) {
            armourMap.put(armour.getId(), armour.getName());
        }

        return armourMap;
    }

    public Map<Integer, String> getAllWeapons() throws FileNotFoundException {
        List<Weapon> allWeapons = equipmentJsonReader.getAllWeapons();
        Map<Integer, String> weaponMap = new HashMap<>();

        for (Weapon weapon: allWeapons) {
            weaponMap.put(weapon.getId(), weapon.getName());
        }

        return weaponMap;
    }

    public Equipment getEquipmentFrom(int equipmentId) throws FileNotFoundException {
        List<Equipment> allEquipment = equipmentJsonReader.getAllEquipment();

        return allEquipment.get(equipmentId);
    }

    public Armour getArmourFrom(int armourId) throws FileNotFoundException {
        List<Armour> allArmour = equipmentJsonReader.getAllArmour();

        return allArmour.get(armourId);
    }

    public Weapon getWeaponFrom(int weaponId) throws FileNotFoundException {
        List<Weapon> allWeapon = equipmentJsonReader.getAllWeapons();

        return allWeapon.get(weaponId);
    }
}
