public class AudioBook extends Book {
    private double durationHours;

    public AudioBook(String title, String author, int pages, double durationHours) {
        super(title, author, pages);
    }

    public double getDurationHours() {
        return durationHours;
    }

    public String toString() {
        return super.toString() + " - " + durationHours + " hrs";
    }
}