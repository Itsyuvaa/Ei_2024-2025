Astronaut Daily Schedule Organizer

Overview

The "Astronaut Daily Schedule Organizer" is a console-based application designed to help astronauts manage their daily schedules effectively. The application allows users to add, remove, and view tasks, ensuring no overlapping tasks and prioritizing task management. The implementation showcases the use of various design patterns, including Singleton, Factory, and Observer, to create a robust and maintainable system.

Key Features

Add Tasks: Users can add tasks with a description, start time, end time, and priority level (High, Medium, Low).

Remove Tasks: Users can remove tasks by specifying the task description.

View Tasks: Tasks are displayed in chronological order, with conflicts highlighted.

Conflict Detection: The system ensures that new tasks do not overlap with existing ones.

Optional Features: The system can be extended to edit tasks, mark them as completed, and filter by priority level.

Design Patterns

Singleton Pattern

ScheduleManager: The Singleton pattern ensures that there is only one instance of the ScheduleManager class, which manages all tasks. This design choice centralizes task management, ensuring consistency and preventing conflicts in task scheduling.

Factory Pattern

TaskFactory: The TaskFactory class encapsulates the creation of Task objects. This abstraction simplifies the creation process and provides a centralized place to manage the task instantiation logic, ensuring that tasks are created consistently.

Observer Pattern

Observer Interface and ConcreteObserver: The Observer pattern is used to notify users of task conflicts or updates. The ScheduleManager registers observers that get notified whenever a new task is added, alerting the user to potential scheduling conflicts.
