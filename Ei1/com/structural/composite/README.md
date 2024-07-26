Composite Design Pattern Example

Overview

This project demonstrates the use of the Composite design pattern in Java. The Composite pattern allows us to treat individual objects and compositions of objects uniformly. In this example, we model a computer system composed of various components like CPU, RAM, HardDrive, GraphicsCard, and SoundCard. The Computer class acts as a composite that can contain multiple components, each implementing the Component interface.

Project Structure

The project consists of the following classes:

Interfaces:

Component: An interface with the assemble method, representing a generic component.

Concrete Components:

CPU, RAM, HardDrive, GraphicsCard, SoundCard: These classes implement the Component interface and provide specific implementations for assembling each component.

Composite Class:

Computer: This class implements the Component interface and acts as a container for other components, allowing them to be assembled together.

Main Class:
CompositeExample: The entry point of the application, demonstrating the usage of the Composite pattern by creating a Computer object and adding various components to it.
