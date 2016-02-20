package com.electric3.dataatoms;

import java.util.List;

public class Delivery extends Gsonable {
    private Object _id;
    private User assignee;
    private List<Comment> comments;
    private List<Attachment> attachments;
    private int progress; // value from 0 to 100
    private StatusEnum status;
    private String title;
    private String description;

    public Delivery() {
    }

    public Delivery(String description, String title, StatusEnum status, int progress, List<Attachment> attachments, List<Comment> comments, User assignee) {
        this.description = description;
        this.title = title;
        this.status = status;
        this.progress = progress;
        this.attachments = attachments;
        this.comments = comments;
        this.assignee = assignee;
    }

    public Object get_id() {
        return _id;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
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
}
