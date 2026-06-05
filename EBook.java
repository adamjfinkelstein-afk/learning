public class EBook extends Book implements Downloadable {
    private double fileSizeMB;

    public EBook( String title, String author, int pages, double fileSizeMB ) {
        super( title, author, pages);
        this.fileSizeMB = fileSizeMB;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void download() {
        System.out.println( "Downloading " + getTitle() + " (" + fileSizeMB + "MB)...");
    }

    @Override
    public String toString() {
        return super.toString() + " - " + fileSizeMB + "MB";
    }
}