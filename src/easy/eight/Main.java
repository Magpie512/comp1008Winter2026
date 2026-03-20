package easy.eight;

public class Main {
    public static void main(String[] args) {
        Book b = new Book("Generic Book");
        Novel n = new Novel("The Great Adventure");

        b.displayTitle();   // calls Book version
        n.displayTitle();   // calls Novel version
    }
}

