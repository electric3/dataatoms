package com.electric3.dataatoms;

import com.google.gson.annotations.SerializedName;

public enum UserRole {
    @SerializedName("0")
    DIRECTOR ("0"),
    @SerializedName("1")
    MANAGER ("1"),
    @SerializedName("2")
    EMPLOYEE ("2");

    private final String value;
    public String getValue() {
        return value;
    }

    UserRole(String value) {
        this.value = value;
    }
}
