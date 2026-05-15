public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean available;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void checkout() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public String toString() {
        return title + " by " + author;
    }
}