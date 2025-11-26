package practice.Number_1;

public class Book {
    static String title;
    static String author;
    static long price;

    public Book(String title, String author, long price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static long getPrice() {
        return price;
    }

    public static String getAuthor() {
        return author;
    }
    public static String getTitle() {
        return title;
    }
}

