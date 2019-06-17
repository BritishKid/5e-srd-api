package uk.co.rowney.esrdapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rowney.esrdapi.dao.ClassJsonReader;
import uk.co.rowney.esrdapi.dao.EquipmentJsonReader;
import uk.co.rowney.esrdapi.model.Armour;
import uk.co.rowney.esrdapi.model.Equipment;
import uk.co.rowney.esrdapi.model.PcClass;
import uk.co.rowney.esrdapi.model.Weapon;

import java.io.FileNotFoundException;
import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassJsonReader classJsonReader;

    @Autowired
    private EquipmentJsonReader equipmentJsonReader;

    public List<String> getClassList() throws FileNotFoundException {
        return classJsonReader.getListOf("Classes");
    }

    public PcClass getClass(String className) throws FileNotFoundException {
        PcClass aClass = classJsonReader.getClass(className);
        List<Equipment> classStartingEquipment = aClass.getClassStartingEquipment();
        List<Weapon> classStartingWeapons = aClass.getClassStartingWeapon();
        List<Armour>  classStartingArmour = aClass.getClassStartingArmour();

        aClass.setClassStartingEquipment(equipmentJsonReader.getEquipmentFromId(classStartingEquipment));
        aClass.setClassStartingWeapon(equipmentJsonReader.getWeaponFromId(classStartingWeapons));
        aClass.setClassStartingArmour(equipmentJsonReader.getArmourFromId(classStartingArmour));

        if(aClass.isSpellCaster()) {
            //Todo map spells onto object
        }

        return aClass;
    }
}
