import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class LibraryTest {
  Library library;
  Book book;
  Book book2;
  Book book3;


  @Before
  public void before() {
    library = new Library("The Mitchell Library");
    book = new Book("Great Expectations");
    book2 = new Book("The Meaning Of Liff");
    book3 = new Book("The Beano Annual 2003");

  }

  @Test
  public void hasName() {
    assertEquals("The Mitchell Library", library.getName());
  }

  @Test
  public void checkEmptyStock() {
    assertEquals(0, library.stockCount());
  }

  @Test
  public void checkStockAdded() {
    library.add(book);
    library.add(book2);
    assertEquals(2, library.stockCount());
  }

  @Test
  public void checkIsFull() {
    library.add(book);
    library.add(book2);
    library.add(book3);
    assertEquals(true, library.isFull());
  }
}