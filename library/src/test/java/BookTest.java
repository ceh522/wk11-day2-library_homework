import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book1;

    @Before
    public void before() {
        book1 = new Book("Wuthering Heights", "Emily Bronte", "Classic");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Wuthering Heights", book1.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Emily Bronte", book1.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Classic", book1.getGenre());
    }

}