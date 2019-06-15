package uk.co.rowney.esrdapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Equipment {

    //todo generic this and have weapon and armour inherit as their own type
    private String name;
    private String type;
    private int weight; //todo change from int to more viable data type
    private int amount = 0;
    private int value; //values are in gp, may need to change out of int for smaller values or String including coin type
    private String information;

}
