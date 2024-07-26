package com.schedulemanager;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Task task) {
        System.out.println(String.format("Task added: %s", task));
    }
}
