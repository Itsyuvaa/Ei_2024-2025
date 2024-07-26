package com.creational.factory;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("1. Create Windows operating system");
            System.out.println("2. Create macOS operating system");
            System.out.println("3. Create Linux operating system");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    createOperatingSystem("Windows");
                    break;
                case 2:
                    createOperatingSystem("macOS");
                    break;
                case 3:
                    createOperatingSystem("Linux");
                    break;
                case 4:
                    continueLoop = false;
                    break;
                default:
                    LOGGER.warning("Invalid choice. Please try again.");
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void createOperatingSystem(String osType) {
        try {
            OperatingSystem operatingSystem = OperatingSystemFactory.createOperatingSystem(osType);
            operatingSystem.start();
            operatingSystem.shutdown();
        } catch (Exception e) {
            LOGGER.severe("Error creating operating system: " + e.getMessage());
            System.out.println("Error creating operating system: " + e.getMessage());
        }
    }
}