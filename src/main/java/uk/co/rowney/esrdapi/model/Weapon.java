package uk.co.rowney.esrdapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weapon {

    private int id;
    private String name;
    private String type;
    private int weight; //todo change from int to more viable data type
    private int amount = 0;
    private int value; //values are in gp, may need to change out of int for smaller values or String including coin type
    private String description;
    private String damage;
    private DamageType damageType;
    private boolean magical;

}
