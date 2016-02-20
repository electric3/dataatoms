package com.electric3.dataatoms;

import com.google.gson.Gson;

public class Gsonable {
    private static final Gson gson = new Gson();

    public String serialize() {
        return gson.toJson(this);
    }

    public static <T extends Gsonable> T deserialize(String string, Class<T> tClass) {
        return gson.fromJson(string, tClass);
    }
}
