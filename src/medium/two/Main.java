package medium.two;

import java.util.Scanner;

class ShapeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for dimensions
        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        // Create a Rectangle using the user's values
        Rectangle r = new Rectangle(width, height);

        // Compute and display the area
        System.out.println("Area of rectangle: " + r.area());

        input.close();
    }
}