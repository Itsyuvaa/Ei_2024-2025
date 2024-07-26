package com.creational.builder;

public class Phone {
    private String brand;
    private String model;
    private int storage;
    private int ram;
    private String color;

    // Constructor
    public Phone(String brand, String model, int storage, int ram, String color) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.ram = ram;
        this.color = color;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }
}
