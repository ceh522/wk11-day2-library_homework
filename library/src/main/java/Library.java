import java.io.IOException;
import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> stock;

    public Library(int capacity){
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }
    

    public int stockCount() {
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stockCount() <this.capacity) {
            this.stock.add(book);
        }
    }

//    Initial work on extension, in pseudocode:
//    public void searchStockForBook(Book book) {
//       for item in this.stock;
//                if item == book;
//                return book;
//        }

//  Solution:
//   public boolean checkInStock(Book book) {
//    for(Book individualBook:this.collection){
//        if(individualBook == book){
//            return true;
//        }
//    }
//    return false;
//}
//
//    public void loanBook(Book book, Borrower borrower) {
//        if(this.collection.contains(book)){
//            this.collection.remove(book);
////            borrower.addBook(book);
//        }
//    }

//    The contains() method checks whether a string contains a sequence of characters.
////    Returns true if the characters exist and false if not.

    }
}
