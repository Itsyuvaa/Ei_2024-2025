package com.structural.adapter;

import java.util.logging.Logger;


public class PilotPenImpl implements PilotPen {
    private static final Logger LOGGER = Logger.getLogger("PilotPenImpl");

    @Override
    public void mark() {
        LOGGER.info("Marking with Pilot Pen...");
    }
}
