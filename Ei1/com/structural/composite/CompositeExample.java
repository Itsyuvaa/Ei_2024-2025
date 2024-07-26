package com.structural.composite;

import java.util.Scanner;
import java.util.logging.Logger;

public class CompositeExample {
    private static final Logger LOGGER = Logger.getLogger("CompositeExample");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter 'y' to assemble computer, 'n' to exit:");
        String input = scanner.next();

        while (input.equalsIgnoreCase("y")) {
            try {
                Computer computer = new Computer();

                CPU cpu = new CPU();
                RAM ram = new RAM();
                HardDrive hardDrive = new HardDrive();
                GraphicsCard graphicsCard = new GraphicsCard();
                SoundCard soundCard = new SoundCard();

                computer.addComponent(cpu);
                computer.addComponent(ram);
                computer.addComponent(hardDrive);
                computer.addComponent(graphicsCard);
                computer.addComponent(soundCard);

                computer.assemble();

                LOGGER.info("Enter 'y' to assemble computer, 'n' to exit:");
                input = scanner.next();
            } catch (Exception e) {
                LOGGER.severe("Error running composite example: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
