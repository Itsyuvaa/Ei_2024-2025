Adapter Design Pattern Example

Overview

This project demonstrates the use of the Adapter design pattern in Java. The Adapter pattern allows incompatible interfaces to work together by creating a bridge between them. In this example, the PenAdapter class acts as an adapter, enabling the PilotPen interface to be used where the Pen interface is expected.

Project Structure

The project consists of the following classes:

Interfaces:

Pen: An interface with the write method.

PilotPen: An interface with the mark method.

Implementations:

PilotPenImpl: Implements the PilotPen interface, providing the mark method.

PenAdapter: Implements the Pen interface by using a PilotPen instance to perform the write operation.

Usage:

Student: Uses a Pen to complete an assignment.

AdapterExample: The main class demonstrating how to use the PenAdapter to adapt a PilotPen for use with a Student.
