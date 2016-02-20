package com.electric3.dataatoms;

public class Comment extends Gsonable {
    private Object _id;
    private User author;
    private String comment;
    private long timestamp;

    public Comment(User author, String comment, long timestamp) {
        this.author = author;
        this.comment = comment;
        this.timestamp = timestamp;
    }

    public Comment() {

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

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Object get_id() {
        return _id;
    }
}
