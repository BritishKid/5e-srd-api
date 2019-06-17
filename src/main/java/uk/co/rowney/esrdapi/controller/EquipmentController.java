package uk.co.rowney.esrdapi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquipmentController {

    @RequestMapping("/equipment/all")
    public String getAllEquipment() {
        return "all equipment";
    }

    @RequestMapping("/equipment/armour/all")
    public String getAllArmour() {
        return "all armour";
    }

    @RequestMapping("/equipment/armour/name={armourName}")
    public String getArmour(@PathVariable("armourName") String armourName) {

        return armourName;
    }

    @RequestMapping("/equipment/weapon/all")
    public String getAllWeapons() {
        return "all weapon";
    }

    @RequestMapping("/equipment/weapon/name={weaponName}")
    public String getWeapon(@PathVariable("weaponName") String weaponName) {

        return weaponName;
    }

    @RequestMapping("/equipment/item/all")
    public String getAllItems() {
        return "all items";
    }

    @RequestMapping("/equipment/item/name={itemName}")
    public String getItem   (@PathVariable("itemName") String itemName) {

        return itemName;
    }
}
