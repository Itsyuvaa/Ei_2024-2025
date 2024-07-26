YouTube Notification System
Overview
This project implements a YouTube notification system using the Observer design pattern. The Observer pattern is a behavioral design pattern that allows an object, known as the subject, to maintain a list of its dependents, called observers, and notify them of state changes. In this example, YouTubeChannel serves as the subject, and YouTubeNotification implements the Subscriber interface to act as the observer.

Project Structure
The project consists of the following components:

Video: A simple class representing a video, containing attributes like title and description.

Subscriber Interface: An interface with an update method that all subscribers must implement. This method is called when a new video is uploaded.

YouTubeChannel: The subject class that manages a list of subscribers and notifies them when a new video is uploaded.

YouTubeNotification: The observer class that implements the Subscriber interface. It subscribes to a YouTubeChannel and receives notifications when new videos are uploaded.
