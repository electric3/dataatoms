package com.electric3.dataatoms;

public class Action extends Gsonable {
    private Object _id;
    private User    actionAuthor;
    private String  actionStringRepresentation = "";
    private long    timestamp = 0;
    private String  linkToEvent = "";
    private String  clientId;
    private String  projectId;

    public Action(){
    }

    public Action(User actionAuthor, String actionStringRepresentation, long timestamp, String linkToEvent) {
        this.actionAuthor = actionAuthor;
        this.actionStringRepresentation = actionStringRepresentation;
        this.timestamp = timestamp;
        this.linkToEvent = linkToEvent;
    }

    public void set_id(Object _id) {
        this._id = _id;
    }

    public User getActionAuthor() {
        return actionAuthor;
    }

    public void setActionAuthor(User actionAuthor) {
        this.actionAuthor = actionAuthor;
    }

    public String getActionStringRepresentation() {
        return actionStringRepresentation;
    }

    public void setActionStringRepresentation(String actionStringRepresentation) {
        this.actionStringRepresentation = actionStringRepresentation;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getLinkToEvent() {
        return linkToEvent;
    }

    public void setLinkToEvent(String linkToEvent) {
        this.linkToEvent = linkToEvent;
    }

    public Object get_id() {
        return _id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
