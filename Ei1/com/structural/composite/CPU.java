package com.structural.composite;

import java.util.logging.Logger;

public class CPU implements Component {
    private static final Logger LOGGER = Logger.getLogger("CPU");

    @Override
    public void assemble() {
        LOGGER.info("Assembling CPU...");
    }
}
