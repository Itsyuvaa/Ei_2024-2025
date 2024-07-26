package com.structural.composite;

import java.util.logging.Logger;

public class HardDrive implements Component {
    private static final Logger LOGGER = Logger.getLogger("HardDrive");

    @Override
    public void assemble() {
        LOGGER.info("Assembling HardDrive...");
    }
}
