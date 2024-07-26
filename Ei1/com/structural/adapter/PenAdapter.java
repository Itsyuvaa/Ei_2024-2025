package com.structural.adapter;

import java.util.logging.Logger;

public class PenAdapter implements Pen {
    private static final Logger LOGGER = Logger.getLogger("PenAdapter");
    private PilotPen pilotPen;

    public PenAdapter(PilotPen pilotPen) {
        this.pilotPen = pilotPen;
    }

    @Override
    public void write() {
        try {
            pilotPen.mark();
        } catch (Exception e) {
            LOGGER.severe("Error writing with Pilot Pen: " + e.getMessage());
        }
    }
}