import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book book1;


    @Before
    public void setup() {
        borrower = new Borrower();
        library = new Library(4);
        book1 = new Book("Wuthering Heights", "Emily Bronte", "Classic");
    }

    @Test
    public void checkNumberOfBooksInBorrowersCollection() {
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddBook() {
        this.borrower.addBookToBorrowersCollection(book1);
        assertEquals(1, borrower.collectionCount());
    }
}