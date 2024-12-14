package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private int id;
    private List<Book> borrowedBooks;

    public Patron(String name, int id) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = new ArrayList<>();
    }

    // Get patron name
    public String getName() {
        return name;
    }

    // Get patron ID
    public int getId() {
        return id;
    }

    // Borrow a book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Return a book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Get the list of borrowed books
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
