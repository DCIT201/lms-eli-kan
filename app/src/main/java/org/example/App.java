package org.example;

public class App {
    public static void main(String[] args) {
        // Create library
        Library library = new Library();

        // Add books to library
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));

        // Create patrons
        Patron patron1 = new Patron("Alice", 1);
        Patron patron2 = new Patron("Bob", 2);

        // Lend books to patrons
        System.out.println("Lending 1984 to Alice: " + library.lendBook("1984", patron1));
        System.out.println("Lending The Great Gatsby to Bob: " + library.lendBook("The Great Gatsby", patron2));

        // List books in the library
        System.out.println("\nBooks in the library:");
        for (Book book : library.listBooks()) {
            System.out.println(book.title() + " by " + book.author() + " (Published: " + book.yearPublished() + ")");
        }

        // Return a book
        System.out.println("\nReturning The Great Gatsby from Bob: " + library.returnBook("The Great Gatsby", patron2));

        // List books again
        System.out.println("\nBooks in the library:");
        for (Book book : library.listBooks()) {
            System.out.println(book.title() + " by " + book.author() + " (Published: " + book.yearPublished() + ")");
        }
    }
}
