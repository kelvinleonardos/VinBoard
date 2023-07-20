package com.example.vinboard.models;

public abstract class ClipContent {

    private String content;
    private boolean isPinned;

    public ClipContent(String content, boolean isPinned) {
        this.content = content;
        this.isPinned = isPinned;
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

}
