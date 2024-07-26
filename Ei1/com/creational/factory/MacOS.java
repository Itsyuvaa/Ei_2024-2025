package com.creational.factory;

public class MacOS implements OperatingSystem {
    @Override
    public void start() {
        System.out.println("macOS is starting...");
    }

    @Override
    public void shutdown() {
        System.out.println("macOS is shutting down...");
    }
}
