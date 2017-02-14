import java.util.ArrayList;

public class Library {

  private String name;
  private ArrayList<Book> stock;
  private ArrayList<Borrower> borrows;

  public Library (String name) {
    this.name = name;
    this.stock = new ArrayList<Book>();
    this.borrows = new ArrayList<Borrower>();

  }

  public String getName() {
    return this.name;
  }

  public int stockCount() {
    return stock.size();
  }

  public void add (Book book) {
    stock.add(book);
  }

  public boolean isFull() {
    int full = 3;
    if (stock.size() >= full) {
      return true;
    }
    else {
      return false;
    }
  }

  public void borrowBook {
    borrows.add()
    stock.remove()
  }
}