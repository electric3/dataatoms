package com.electric3.dataatoms;

import java.util.LinkedList;
import java.util.List;

public class Department extends Gsonable {
    private Object _id;
    private User owner;
    private String title = "";
    private String description = "";
    private List<Project> projects = new LinkedList<>();
    private StatusEnum status = StatusEnum.GREEN;
    private int progress = 0;

    public Department() {}

    public Department(User owner, String title, String description, List<Project> projects, StatusEnum status, int progress) {
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.projects = projects;
        this.status = status;
        this.progress = progress;
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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
