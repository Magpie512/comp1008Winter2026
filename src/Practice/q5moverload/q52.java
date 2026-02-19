package practice.q5moverload;
//Create overloaded display() methods:
//One prints a String
//One prints an int
//One prints a double
public class q52 {
    public static void main(String[] args) {
        display("Hello, World!");
        display(42);
        display(3.14);
    }

    public static void display(String message) {
        System.out.println(message);
    }

    public static void display(int number) {
        System.out.println(number);
    }

    public static void display(double number) {
        System.out.println(number);
    }
    // The display() method is overloaded three times to handle different data types: String, int, and double. Each method takes a different parameter type and prints it to the console. The main method demonstrates the use of these overloaded methods by calling them with sample values for each data type.
    // for a method to be overloaded in java,
    // it must have the same name but different parameter lists. This allows the compiler to determine which method to call based on the arguments passed to it. In this case, the display() method is overloaded to handle different types of input, making it more versatile and easier to use in various contexts.
}
