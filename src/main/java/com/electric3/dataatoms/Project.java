package com.electric3.dataatoms;

import java.util.List;

public class Project extends Gsonable {
    private Object _id;
    private User owner;
    private String title;
    private String description;
    private List<Delivery> deliveries;
    private StatusEnum status;
    private int progress;

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Object get_id() {
        return _id;
    }

    public User getOwner() {
        return owner;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }
}
