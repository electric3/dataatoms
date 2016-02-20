package com.electric3.dataatoms;

import java.util.List;

public class Project extends Gsonable {
    private Object _id;
    private User owner;
    private String title;
    private String description;
    private List<Delivery> deliveries;
}
