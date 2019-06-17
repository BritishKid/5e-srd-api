package uk.co.rowney.esrdapi.model;

import com.google.gson.annotations.SerializedName;

public enum School {
    @SerializedName("Abjuration") Abjuration,
    @SerializedName("Conjuration") Conjuration,
    @SerializedName("Divination") Divination,
    @SerializedName("Enchantment") Enchantment,
    @SerializedName("Evocation") Evocation,
    @SerializedName("Illusion") Illusion,
    @SerializedName("Necromancy") Necromancy,
    @SerializedName("Transmutation") Transmutation,
    @SerializedName("Universal") Universal;
}
