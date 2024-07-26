package com.behavioural.observer;

public class Video {
    private String title;
    private String description;

    public Video(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
