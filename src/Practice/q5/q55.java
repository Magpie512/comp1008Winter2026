package practice.q5;

        //Create overloaded greet() methods:
        //One takes no parameters
        //One takes a name
        //One takes name and age

public class q55 {
    public static void main(String[] args) {
        greet();
        greet("Alice");
        greet("Bob", 30);
    }

    public static void greet() {
        System.out.println("Hello!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
    
}
