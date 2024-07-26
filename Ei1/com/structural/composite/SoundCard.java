package com.structural.composite;

import java.util.logging.Logger;

public class SoundCard implements Component {
    private static final Logger LOGGER = Logger.getLogger("SoundCard");

    @Override
    public void assemble() {
        LOGGER.info("Assembling SoundCard...");
    }
}

