package uk.co.rowney.esrdapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.rowney.esrdapi.dao.ClassJsonReader;
import uk.co.rowney.esrdapi.dao.EquipmentJsonReader;
import uk.co.rowney.esrdapi.model.Armour;
import uk.co.rowney.esrdapi.model.Equipment;
import uk.co.rowney.esrdapi.model.ClassInfo;
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

    public ClassInfo getClass(String className) throws FileNotFoundException {
        ClassInfo aClass = classJsonReader.getClass(className);

        if(aClass.isSpellCaster()) {
            //Todo map spells onto object
        }

        return aClass;
    }
}
