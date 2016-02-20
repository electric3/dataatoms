package com.electric3.dataatoms;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class Gsonable  {
    public String serialize() {
        return new Gson().toJson(this);
    }

    public static Object deserialize(Class clazz, String str) {
        return new Gson().fromJson(str, clazz);
    }

    public static Object deserialize(Type type, String str) {
        return new Gson().fromJson(str, type);
    }

    public <T extends Gsonable> T deserialize(String string, Class<T> tClass) {
        return new Gson().fromJson(string, tClass);
    }
}
