
// Library class
package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> listBooks() {
        return books;
    }

    public boolean lendBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isBorrowed()) {
                book.borrow();
                return true;
            }
        }
        return false; // Book not available or already borrowed
    }

    public boolean returnBook(String title, Patron patron) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isBorrowed()) {
                book.returnBook();
                return true;
            }
        }
        return false; // Book not found or wasn't borrowed
    }
}