package com.structural.composite;

import java.util.logging.Logger;

public class GraphicsCard implements Component {
    private static final Logger LOGGER = Logger.getLogger("GraphicsCard");

    @Override
    public void assemble() {
        LOGGER.info("Assembling GraphicsCard...");
    }
}
