package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // List all books in the library
    public List<Book> listBooks() {
        return books;
    }

    // Lend a book to a patron
    public boolean lendBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.title().equals(title)) {
                System.out.println(patron.getName() + " has borrowed: " + title);
                return true;
            }
        }
        return false; // Book not found or unavailable
    }

    // Return a book
    public boolean returnBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.title().equals(title)) {
                System.out.println(patron.getName() + " has returned: " + title);
                return true;
            }
        }
        return false; // Book not found or was never borrowed
    }
}
