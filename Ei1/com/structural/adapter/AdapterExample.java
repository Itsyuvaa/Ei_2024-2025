package com.structural.adapter;

import java.util.Scanner;
import java.util.logging.Logger;

public class AdapterExample {
    private static final Logger LOGGER = Logger.getLogger("AdapterExample");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter 'y' to complete assignment, 'n' to exit:");
        String input = scanner.next();

        while (input.equalsIgnoreCase("y")) {
            try {
                PilotPen pilotPen = new PilotPenImpl();
                PenAdapter adapter = new PenAdapter(pilotPen);

                Student student = new Student();
                student.completeAssignment(adapter);

                LOGGER.info("Enter 'y' to complete assignment, 'n' to exit:");
                input = scanner.next();
            } catch (Exception e) {
                LOGGER.severe("Error running adapter example: " + e.getMessage());
            }
        }

        scanner.close();
    }
}