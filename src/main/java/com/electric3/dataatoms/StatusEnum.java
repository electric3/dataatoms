package com.electric3.dataatoms;

import com.google.gson.annotations.SerializedName;

public enum StatusEnum {
    @SerializedName("0")
    red,
    @SerializedName("1")
    orange,
    @SerializedName("2")
    green;
}
