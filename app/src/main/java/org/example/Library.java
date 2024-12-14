package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books; // List of books in the library
    private List<Patron> patrons; // List of patrons

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Lend a book to a patron
    public boolean lendBook(String bookTitle, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle) && !book.isBorrowed()) {
                book.setBorrowed(true);
                patron.borrowBook(book);
                return true;
            }
        }
        return false; // Book not available
    }

    // Return a book to the library
    public boolean returnBook(String bookTitle, Patron patron) {
        for (Book book : patron.getBorrowedBooks()) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                book.setBorrowed(false);
                patron.returnBook(book);
                return true;
            }
        }
        return false; // Book not borrowed by the patron
    }

    // List all books in the library
    public List<Book> listBooks() {
        return books;
    }
}