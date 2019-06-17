package uk.co.rowney.esrdapi.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Repository;
import uk.co.rowney.esrdapi.model.Armour;
import uk.co.rowney.esrdapi.model.Equipment;
import uk.co.rowney.esrdapi.model.Weapon;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EquipmentJsonReader extends JsonReader {

    private Gson gson = new Gson();


    public List<Equipment> getEquipmentFromId(List<Equipment> classStartingEquipment) throws FileNotFoundException {
        List<Equipment> allEquipment = getAllEquipment();
        List<Equipment> updatedStartingEquipment = new ArrayList<>();

        if (!(classStartingEquipment == null)) {
            if (!classStartingEquipment.isEmpty()) {
                for (Equipment equipment : classStartingEquipment) {
                    updatedStartingEquipment.add(allEquipment.get(equipment.getId()));
                }
            }
        }

        return updatedStartingEquipment;
    }

    public List<Weapon> getWeaponFromId(List<Weapon> classStartingWeapons) throws FileNotFoundException {
        List<Weapon> allWeapons = getAllWeapons();
        List<Weapon> updatedStartingWeapons = new ArrayList<>();

        if (!(classStartingWeapons == null)) {
            if (!classStartingWeapons.isEmpty()) {
                for (Weapon weapon : classStartingWeapons) {
                    updatedStartingWeapons.add(allWeapons.get(weapon.getId()));
                }
            }
        }

        return updatedStartingWeapons;
    }

    public List<Armour> getArmourFromId(List<Armour> classStartingArmour) throws FileNotFoundException {
        List<Armour> allArmours = getAllArmour();
        List<Armour> updatedStartingArmour = new ArrayList<>();

        if (!(classStartingArmour == null)) {
            if (!classStartingArmour.isEmpty()) {
                for (Armour armour : classStartingArmour) {
                    updatedStartingArmour.add(allArmours.get(armour.getId()));
                }
            }
        }

        return updatedStartingArmour;
    }

    public List<Weapon> getAllWeapons() throws FileNotFoundException {
        Type REVIEW_TYPE = new TypeToken<List<Weapon>>() {
        }.getType();
        URL url = getClass().getResource("/json/equipment/Weapons.json");
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new FileReader(url.getPath()));
        return gson.fromJson(reader, REVIEW_TYPE);
    }

    public List<Equipment> getAllEquipment() throws FileNotFoundException {
        Type REVIEW_TYPE = new TypeToken<List<Equipment>>() {
        }.getType();
        URL url = getClass().getResource("/json/equipment/Equipment.json");
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new FileReader(url.getPath()));
        return gson.fromJson(reader, REVIEW_TYPE);
    }

    public List<Armour> getAllArmour() throws FileNotFoundException {
        Type REVIEW_TYPE = new TypeToken<List<Armour>>() {
        }.getType();
        URL url = getClass().getResource("/json/equipment/Armour.json");
        com.google.gson.stream.JsonReader reader = new com.google.gson.stream.JsonReader(new FileReader(url.getPath()));
        return gson.fromJson(reader, REVIEW_TYPE);
    }
}
