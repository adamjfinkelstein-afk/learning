public class Library {
    public static void main( String[] args ) {
        Book book1 = new Book( "Moby Dick", "Herman Melville", 635);
        Book book2 = new Book( "The Great Gatsby", "F. Scott Fitzgerald", 180 );

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        System.out.println(book1.isAvailable());

        // book1.checkout();
        // System.out.println(book1.isAvailable());

        Member member1 = new Member("Adam", "London" ); 
        System.out.println(member1.getLibraryCardID());

        member1.checkoutBook(book1);
        System.out.println(member1.getBorrowedBooks());
        System.out.println(book1.isAvailable());

        EBook ebook1 = new EBook("The Hobbit", "J.R.R. Tolkien", 310, 2.5 );
        System.out.println(ebook1.getTitle());
        System.out.println(ebook1.getFileSizeMB());
        System.out.println(ebook1.isAvailable());
    }
}