package com.behavioural.observer;

import java.util.Scanner;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        try {
            Logger.getLogger("").setLevel(java.util.logging.Level.INFO);
            java.util.logging.ConsoleHandler consoleHandler = new java.util.logging.ConsoleHandler();
            consoleHandler.setLevel(java.util.logging.Level.INFO);
            Logger.getLogger("").addHandler(consoleHandler);

            Scanner scanner = new Scanner(System.in);
            YouTubeChannel channel = new YouTubeChannel();
            YouTubeNotification notification = new YouTubeNotification(channel);
            boolean keepRunning = true;
            while (keepRunning) {
                System.out.println("Enter 'upload' to upload a new video or 'exit' to quit:");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("upload")) {
                    System.out.println("Enter video title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter video description:");
                    String description = scanner.nextLine();
                    Video video = new Video(title, description);
                    channel.uploadVideo(video);
                } else if (input.equalsIgnoreCase("exit")) {
                    keepRunning = false;
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).severe("Error in main method: " + e.getMessage());
        }
    }
}
