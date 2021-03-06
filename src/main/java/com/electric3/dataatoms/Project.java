package com.electric3.dataatoms;

public class Project extends Gsonable implements IStatusProvider, IProgressProvider {
    private Object _id;
    private User owner;
    private String title = "";
    private String description = "";
    private StatusEnum status = StatusEnum.GREEN;
    private int progress = 0;
    private String deadline = "";
    private String departmentId = "";
    private String createdAt = "";
    private String modifiedAt = "";

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void set_id(Object _id) {
        this._id = _id;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public StatusEnum getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
