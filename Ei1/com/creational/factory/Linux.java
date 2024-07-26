package com.creational.factory;

public class Linux implements OperatingSystem {
    @Override
    public void start() {
        System.out.println("Linux is starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Linux is shutting down...");
    }
}
