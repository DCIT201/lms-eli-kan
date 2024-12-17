import org.junit.Test;
import static org.junit.Assert.*;

public class Book {

    @Test
    public void testBookBorrow() {
        Book book = new Book("1984", "George Orwell");
        assertFalse(book.isBorrowed()); // Initially, the book should not be borrowed.

        book.borrow();
        assertTrue(book.isBorrowed()); // After borrowing, the book should be borrowed.
    }

    @Test
    public void testBookReturn() {
        Book book = new Book("1984", "George Orwell");
        book.borrow();
        assertTrue(book.isBorrowed()); // The book should be borrowed.

        book.returnBook();
        assertFalse(book.isBorrowed()); // After returning, the book should not be borrowed.
    }
}
