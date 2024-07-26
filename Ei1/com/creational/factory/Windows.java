package com.creational.factory;

public class Windows implements OperatingSystem {
    @Override
    public void start() {
        System.out.println("Windows is starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("Windows is shutting down...");
    }
}
