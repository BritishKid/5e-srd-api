package uk.co.rowney.esrdapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spell {

    private int id;
    private String name;
    private int level;
    private String castingTime;
    private String range;
    private String components;
    private String duration;
    private School school;
    private String neededRoll;
    private String damage;
    private DamageType damageType;
    private String affect;
    private String description;

}
