import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
Library library;
Book book1;
Book book2;
Book book3;
Book book4;
Book book5;

@Before
public void before(){
    library = new Library(4);
    book1 = new Book("Wuthering Heights", "Emily Bronte", "Classic");
    book2 = new Book("The Darker Arts", "Oscar de Muriel", "thriller");
    book3 = new Book("The No.1 Ladies Detective Agency", "Alexander McCall Smith", "detective");
    book4 = new Book("Dead Man's Folly", "Agatha Christie", "detective");
    book5 = new Book("A Murder is Announced", "Agatha Christie", "detective");
}
    @Test
    public void checkNumberOfBooksInLibraryStock(){
    assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook(){
    library.addBook(book1);
    assertEquals(1, library.stockCount());
    }

    @Test
    public void cantAddBookOnceLibraryReachesMaximumCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.stockCount());
    }

//    Solution:

//    @Test
//    public void checkBookAvailable() {
//        assertEquals(false, library.checkInStock(book1));
//    }

//    @Test
//    public void checkBookAvailable__true() {
//    library.addBook(book1);
//    assertEquals(true, library.checkInStock(book1));
//}
//
//    @Test
//    public void testCanLendBook() {
//    library.addBook(book1);
//    library.loanBook(book1, borrower);
//     assertEquals(1, borrower.bookCount());
//     assertEquals(0, library.bookCount());
//     assertEquals(false, library.checkInStock(book1));
//    }

}
