package com.electric3.dataatoms;

public class Action extends Gsonable {
    private Object _id;
    private String actionStringRepresentation = "";
    private String timestamp = "";
    private String linkToEvent = "";
    private String clientId = "";
    private String projectId = "";
    private String departmentId = "";

    public void set_id(Object _id) {
        this._id = _id;
    }

    public String getActionStringRepresentation() {
        return actionStringRepresentation;
    }

    public void setActionStringRepresentation(String actionStringRepresentation) {
        this.actionStringRepresentation = actionStringRepresentation;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
