package com.creational.factory;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class OperatingSystemFactory {
    private static final Logger LOGGER = Logger.getLogger(OperatingSystemFactory.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("operating_system_factory.log", true);
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (Exception e) {
            LOGGER.severe("Error initializing logger: " + e.getMessage());
        }
    }

    public static OperatingSystem createOperatingSystem(String osType) {
        if (osType == null || osType.isEmpty()) {
            throw new IllegalArgumentException("Invalid operating system type");
        }

        try {
            if (osType.equalsIgnoreCase("Windows")) {
                return new Windows();
            } else if (osType.equalsIgnoreCase("macOS")) {
                return new MacOS();
            } else if (osType.equalsIgnoreCase("Linux")) {
                return new Linux();
            } else {
                throw new UnsupportedOperationException("Unsupported operating system");
            }
        } catch (Exception e) {
            LOGGER.severe("Error creating operating system: " + e.getMessage());
            throw e;
        }
    }
}
