Prototype Design Pattern Example

Overview

This project demonstrates the use of the Prototype design pattern in Java. The Prototype pattern is used to create a new object by copying an existing object, known as the prototype. In this example, the Book class implements the Cloneable interface, allowing us to create copies of a prototype Book object. The Bookshop class uses this prototype to create new books with modified properties.

Project Structure

The project consists of the following classes:

Book: A class representing a book, which includes the title, author, and price. It implements the Cloneable interface to allow cloning.

Bookshop: A class representing a bookstore that uses a prototype Book object to create new books. It manages an array of books and provides methods to add and print books.

Main Class: Contains the main method, which serves as the entry point of the application, allowing users to interact with the system.
