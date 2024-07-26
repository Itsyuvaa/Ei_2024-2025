package com.creational.builder;

public class PhoneBuilder {
    private String brand;
    private String model;
    private int storage;
    private int ram;
    private String color;

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Phone build() {
        return new Phone(brand, model, storage, ram, color);
    }
}
