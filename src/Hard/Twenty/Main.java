package Hard.Twenty;

// Demonstration of polymorphism
public class Main {
    public static void main(String[] args) {
        Shape s = new Triangle(3, 4, 5); // polymorphic reference

        System.out.println("Perimeter: " + s.perimeter());
        System.out.println("Area: " + s.area());
    }
}
