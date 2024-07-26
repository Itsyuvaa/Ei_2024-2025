package com.creational.builder;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("phone_shop.log", true);
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (Exception e) {
            LOGGER.severe("Error initializing logger: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("1. Create a new phone");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    createPhone(scanner);
                    break;
                case 2:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void createPhone(Scanner scanner) {
        try {
            System.out.print("Enter brand: ");
            String brand = scanner.nextLine();

            System.out.print("Enter model: ");
            String model = scanner.nextLine();

            System.out.print("Enter storage (in GB): ");
            int storage = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            System.out.print("Enter RAM (in GB): ");
            int ram = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            System.out.print("Enter color: ");
            String color = scanner.nextLine();

            PhoneBuilder phoneBuilder = new PhoneBuilder();
            Phone phone = phoneBuilder
                   .setBrand(brand)
                   .setModel(model)
                   .setStorage(storage)
                   .setRam(ram)
                   .setColor(color)
                   .build();

            System.out.println("Phone created:");
            System.out.println("Brand: " + phone.getBrand());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Storage: " + phone.getStorage() + "GB");
            System.out.println("RAM: " + phone.getRam() + "GB");
            System.out.println("Color: " + phone.getColor());
        } catch (Exception e) {
            LOGGER.severe("Error creating phone: " + e.getMessage());
            System.out.println("Error creating phone: " + e.getMessage());
        }
    }
}
