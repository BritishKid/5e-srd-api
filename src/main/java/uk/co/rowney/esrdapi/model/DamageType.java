package uk.co.rowney.esrdapi.model;

import com.google.gson.annotations.SerializedName;

public enum DamageType {

    @SerializedName("Acid") Acid,
    @SerializedName("Bludgeoning") Bludgeoning,
    @SerializedName("Cold") Cold,
    @SerializedName("Fire") Fire,
    @SerializedName("Force") Force,
    @SerializedName("Healing") Healing,
    @SerializedName("Lightning") Lightning,
    @SerializedName("Necrotic") Necrotic,
    @SerializedName("Piercing") Piercing,
    @SerializedName("Poison") Poison,
    @SerializedName("Psychic") Psychic,
    @SerializedName("Radiant") Radiant,
    @SerializedName("Slashing") Slashing,
    @SerializedName("Thunder") Thunder;

}
