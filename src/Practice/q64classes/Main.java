package practice.q64classes;
//Question 6.4
//Create a Book class with:
//private title
//private author
//private price
//Create 3 books in an array and print the most expensive book.

public class Main {
    static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        books[1] = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);
        books[2] = new Book("1984", "George Orwell", 8.99);

        Book mostExpensiveBook = books[0];

        /*for (int i = 0; i < books.length; i++){
            if(books[i].getPrice() > mostExpensiveBook.getPrice()){
                mostExpensiveBook = books[i];
            }
        }*/

        for (Book book : books) {
            if (book.getPrice() > mostExpensiveBook.getPrice()) {
                mostExpensiveBook = book;
            }
        }

        System.out.println("The most expensive book is: " + mostExpensiveBook.getTitle() + " by " + mostExpensiveBook.getAuthor() + " with a price of $" + mostExpensiveBook.getPrice());
    }
}