package com.behavioural.prototype;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter prototype book title:");
        String title = scanner.nextLine();
        System.out.println("Enter prototype book author:");
        String author = scanner.nextLine();
        System.out.println("Enter prototype book price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        Book prototypeBook = new Book(title, author, price);
        Bookshop bookshop = new Bookshop(prototypeBook, 10);

        String input;
        do {
            System.out.println("Enter 'create' to create a new book or 'print' to print all books or 'exit' to quit:");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("create")) {
                bookshop.addBook();
            } else if (input.equalsIgnoreCase("print")) {
                bookshop.printBooks();
            } else if (!input.equalsIgnoreCase("exit")) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!input.equalsIgnoreCase("exit"));
    }
}
