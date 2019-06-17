package uk.co.rowney.esrdapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.co.rowney.esrdapi.model.Armour;
import uk.co.rowney.esrdapi.model.Equipment;
import uk.co.rowney.esrdapi.model.Weapon;
import uk.co.rowney.esrdapi.service.EquipmentService;

import java.io.FileNotFoundException;
import java.util.Map;

@RestController
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @RequestMapping("/equipment/item/all")
    public Map<Integer, String> getAllEquipment() throws FileNotFoundException {
        return equipmentService.getAllEquipment();
    }

    @RequestMapping("/equipment/item/id={equipmentId}")
    public Equipment getItem(@PathVariable("equipmentId") int equipmentId) throws FileNotFoundException {

        return equipmentService.getEquipmentFrom(equipmentId);
    }

    @RequestMapping("/equipment/armour/all")
    public Map<Integer, String> getAllArmour() throws FileNotFoundException {
        return equipmentService.getAllArmour();
    }

    @RequestMapping("/equipment/armour/id={armourId}")
    public Armour getArmour(@PathVariable("armourId") int armourId) throws FileNotFoundException {

        return equipmentService.getArmourFrom(armourId);
    }

    @RequestMapping("/equipment/weapon/all")
    public Map<Integer, String> getAllWeapons() throws FileNotFoundException {
        return equipmentService.getAllWeapons();
    }

    @RequestMapping("/equipment/weapon/id={weaponId}")
    public Weapon getWeapon(@PathVariable("weaponId") int weaponId) throws FileNotFoundException {

        return equipmentService.getWeaponFrom(weaponId);
    }
}
