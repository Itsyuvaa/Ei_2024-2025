package com.schedulemanager;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task {
    LocalTime startTime;
    LocalTime endTime;
    String description;
    String priority;

    public Task(String description, String startTime, String endTime, String priority) {
        try {
            this.startTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm"));
            this.endTime = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm"));
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Invalid time format. Please use HH:mm.", "", 0);
        }
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s [%s]", startTime.toString(), endTime.toString(), description, priority);
    }
}
