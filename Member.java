import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int libraryCardID;
    private String address;
    private List<Book> borrowedBooks;

    private static int nextID = 1;

    public Member( String name, String address ) {
        this.name = name;
        this.address = address;
        this.libraryCardID = nextID++;
        this.borrowedBooks = new ArrayList<>();
    }

    public void checkoutBook( Book book ) {
        // add book to List
        book.checkout();
        borrowedBooks.add(book);
    }

    public void returnBook( Book book ) {
        // remove book from list
        book.returnBook();
        borrowedBooks.remove(book); 
    }

    
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public int getLibraryCardID() {
        return libraryCardID;
    }
}