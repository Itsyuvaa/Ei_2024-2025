package com.schedulemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<Observer> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(Task task) {
        for (Observer observer : observers) {
            observer.update(task);
        }
    }

    public void addTask(Task task) {
        for (Task existingTask : tasks) {
            if (task.startTime.isBefore(existingTask.endTime) && task.endTime.isAfter(existingTask.startTime)) {
                Logger logger = Logger.getLogger("schedule_manager");
                logger.severe(String.format("Task conflict: %s conflicts with %s", task, existingTask));
                throw new RuntimeException(
                        String.format("Task conflicts with existing task %s", existingTask.description));
            }
        }
        tasks.add(task);
        Logger logger = Logger.getLogger("schedule_manager");
        logger.info(String.format("Task added: %s", task));
        notifyObservers(task);
        System.out.println("Task added successfully. No conflicts.");
    }

    public void removeTask(String description) {
        for (Task task : tasks) {
            if (task.description.equals(description)) {
                tasks.remove(task);
                Logger logger = Logger.getLogger("schedule_manager");
                logger.info(String.format("Task removed: %s", task));
                System.out.println("Task removed successfully.");
                return;
            }
        }
        Logger logger = Logger.getLogger("schedule_manager");
        logger.severe(String.format("Task not found: %s", description));
        throw new RuntimeException("Task not found");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            tasks.sort((x, y) -> {
                int startTimeComparison = x.startTime.compareTo(y.startTime);
                if (startTimeComparison == 0) {
                    // Compare priorities if start times are equal
                    // Note: This assumes priorities are in the order High, Medium, Low
                    String[] priorities = { "High", "Medium", "Low" };
                    int xPriorityIndex = java.util.Arrays.asList(priorities).indexOf(x.priority);
                    int yPriorityIndex = java.util.Arrays.asList(priorities).indexOf(y.priority);
                    return Integer.compare(xPriorityIndex, yPriorityIndex);
                } else {
                    return startTimeComparison;
                }
            });
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
