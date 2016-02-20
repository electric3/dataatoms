package com.electric3.dataatoms;

import java.util.LinkedList;
import java.util.List;

public class Project extends Gsonable {
    private Object _id;
    private User owner;
    private String title = "";
    private String description = "";
    private List<Delivery> deliveries = new LinkedList<Delivery>();
    private StatusEnum status = StatusEnum.GREEN;
    private int progress = 0;
    private long deadline = 0;

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

    public long getDeadline() {
        return deadline;
    }

    public void setDeadline(long deadline) {
        this.deadline = deadline;
    }
}
