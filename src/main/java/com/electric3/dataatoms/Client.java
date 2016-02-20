package com.electric3.dataatoms;

import java.util.List;

public class Client extends Gsonable {
    private Object _id;
    private User owner;
    private String title;
    private String description;
    private String phone;
    private String email;
    private List<String> departments;

    public Client() {}

    public Client(User owner, String title, String description, String phone, String email) {
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.phone = phone;
        this.email = email;
    }

    public Object get_id() {
        return _id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
