package com.electric3.dataatoms;

public class Department extends Gsonable {
    private Object _id;
    private User owner;
    private String title = "";
    private String description = "";
    private StatusEnum status = StatusEnum.GREEN;
    private String clientId = "";
    private int progress = 0;
    private String createdAt = "";
    private String modifedAt = "";

    public Department() {}

    public Department(User owner, String title, String description, StatusEnum status, int progress) {
        this.owner = owner;
        this.title = title;
        this.description = description;
        this.status = status;
        this.progress = progress;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setModifedAt(String modifedAt) {
        this.modifedAt = modifedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getModifedAt() {
        return modifedAt;
    }

    public void set_id(Object _id) {
        this._id = _id;
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
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
