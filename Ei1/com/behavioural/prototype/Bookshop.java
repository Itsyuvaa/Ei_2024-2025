package com.behavioural.prototype;

import java.util.Scanner;

public class Bookshop {
    private Book prototypeBook;
    private Book[] books;
    private int index;

    public Bookshop(Book prototypeBook, int size) {
        this.prototypeBook = prototypeBook;
        this.books = new Book[size];
        this.index = 0;
    }

    public void addBook() throws CloneNotSupportedException {
        Book newBook = (Book) prototypeBook.clone();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new book title:");
        String title = scanner.nextLine();
        System.out.println("Enter new book author:");
        String author = scanner.nextLine();
        System.out.println("Enter new book price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        newBook = new Book(title, author, price);
        if (index < books.length) {
            books[index] = newBook;
            index++;
        } else {
            System.out.println("Bookshop is full. Cannot add more books.");
        }
    }

    public void printBooks() {
        for (int i = 0; i < index; i++) {
            System.out.println("Book " + (i + 1) + ": " + books[i].getTitle() + " by " + books[i].getAuthor() + " priced at " + books[i].getPrice());
        }
    }
}
