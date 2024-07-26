package com.behavioural.observer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class YouTubeNotification implements Subscriber {
    private YouTubeChannel channel;
    private static final Logger logger = Logger.getLogger(YouTubeNotification.class.getName());

    public YouTubeNotification(YouTubeChannel channel) {
        this.channel = channel;
        try {
            channel.subscribe(this);
        } catch (Exception e) {
            logger.severe("Error subscribing to channel: " + e.getMessage());
        }
    }

    @Override
    public void update(Video video) {
        try (FileWriter writer = new FileWriter("notifications.txt", true)) {
            writer.write("New video uploaded: " + video.getTitle() + " - " + video.getDescription() + "\n");
            System.out.println("New video uploaded: " + video.getTitle() + " - " + video.getDescription());
            logger.info("Notification sent successfully");
        } catch (Exception e) {
            logger.severe("Error sending notification: " + e.getMessage());
        }
    }
}