package com.electric3.dataatoms;

import java.util.LinkedList;
import java.util.List;

// generic holder of atoms
public class Holder<T> extends Gsonable {
    private List<T> items = new LinkedList<T>();

    public void setItems(List<T> items) {
        this.items = items;
    }

    public List<T> getItems() {
        return items;
    }
}
