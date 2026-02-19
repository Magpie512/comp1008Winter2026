package practice.q64classes;
//Question 6.4
//Create a Book class with:
//private title
//private author
//private price
//Create 3 books in an array and print the most expensive book.
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice() {
        return price;
    }
}
