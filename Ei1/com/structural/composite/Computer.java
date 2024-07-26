package com.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Computer implements Component {
    private static final Logger LOGGER = Logger.getLogger("Computer");
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void assemble() {
        try {
            LOGGER.info("Assembling Computer...");
            for (Component component : components) {
                component.assemble();
            }
        } catch (Exception e) {
            LOGGER.severe("Error assembling computer: " + e.getMessage());
        }
    }
}
