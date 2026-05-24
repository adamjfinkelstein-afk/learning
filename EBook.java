public class EBook extends Book {
    private double fileSizeMB;

    public EBook( String title, String author, int pages, double fileSizeMB ) {
        super( title, author, pages);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}