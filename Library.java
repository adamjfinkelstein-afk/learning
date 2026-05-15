public class Library {
    public static void main( String[] args ) {
        Book book1 = new Book( "Moby Dick", "Herman Melville", 635);
        Book book2 = new Book( "The Great Gatsby", "F. Scott Fitzgerald", 180 );

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        System.out.println(book1.isAvailable());

        book1.checkout();
        System.out.println(book1.isAvailable());
    }
}