package com.example.vinboard.models;

public abstract class ClipContent {

    private int id;
    private String content;
    private boolean isPinned;

    public ClipContent(int id, String content, boolean isPinned) {
        this.content = content;
        this.isPinned = isPinned;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public void changeStat() {
        if (isPinned) {
            setPinned(false);
        } else if (!isPinned) {
            setPinned(true);
        }
    }

}
