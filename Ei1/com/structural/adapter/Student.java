package com.structural.adapter;

import java.util.logging.Logger;

public class Student {
    private static final Logger LOGGER = Logger.getLogger("Student");

    public void completeAssignment(Pen pen) {
        try {
            pen.write();
        } catch (Exception e) {
            LOGGER.severe("Error completing assignment: " + e.getMessage());
        }
    }
}