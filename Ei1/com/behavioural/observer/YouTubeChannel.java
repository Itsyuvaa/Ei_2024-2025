package com.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class YouTubeChannel {
    private List<Subscriber> subscribers;
    private Video latestVideo;
    private static final Logger logger = Logger.getLogger(YouTubeChannel.class.getName());

    public YouTubeChannel() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        try {
            subscribers.add(subscriber);
            logger.info("Subscriber added successfully");
        } catch (Exception e) {
            logger.severe("Error adding subscriber: " + e.getMessage());
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        try {
            subscribers.remove(subscriber);
            logger.info("Subscriber removed successfully");
        } catch (Exception e) {
            logger.severe("Error removing subscriber: " + e.getMessage());
        }
    }

    public void uploadVideo(Video video) {
        try {
            latestVideo = video;
            notifySubscribers();
            logger.info("Video uploaded successfully");
        } catch (Exception e) {
            logger.severe("Error uploading video: " + e.getMessage());
        }
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            try {
                subscriber.update(latestVideo);
            } catch (Exception e) {
                logger.severe("Error notifying subscriber: " + e.getMessage());
            }
        }
    }
}
