package com.electric3.dataatoms;

public class Attachment extends Gsonable {
    private Object _id;
    private String displayName;
    private String location;
    private String description;

    public Attachment(String displayName, String location, String description) {
        this.displayName = displayName;
        this.location = location;
        this.description = description;
    }

    public Attachment() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object get_id() {
        return _id;
    }

    public void set_id(Object _id) {
        this._id = _id;
    }
}
