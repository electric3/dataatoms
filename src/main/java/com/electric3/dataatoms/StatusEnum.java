package com.electric3.dataatoms;

import com.google.gson.annotations.SerializedName;

public enum StatusEnum {
    @SerializedName("0")
    RED("0"),
    @SerializedName("1")
    ORANGE("1"),
    @SerializedName("2")
    GREEN("2");

    private final String value;

    public String getValue() {
        return value;
    }

    StatusEnum(String value) {
        this.value = value;
    }
}
