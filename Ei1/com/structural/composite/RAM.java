package com.structural.composite;

import java.util.logging.Logger;

public class RAM implements Component {
    private static final Logger LOGGER = Logger.getLogger("RAM");

    @Override
    public void assemble() {
        LOGGER.info("Assembling RAM...");
    }
}
