package com.electric3.dataatoms;

public class Comment extends Gsonable {
    private Object _id;
    private User author;
    private String comment = "";
    private String timestamp = "";

    public Comment(User author, String comment, String timestamp) {
        this.author = author;
        this.comment = comment;
        this.timestamp = timestamp;
    }

    public Comment() {

    }

    public void set_id(Object _id) {
        this._id = _id;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Object get_id() {
        return _id;
    }
}
