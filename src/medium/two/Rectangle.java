package medium.two;

// Rectangle is a specific kind of Shape, so it inherits from Shape
public class Rectangle extends Shape {

    // These fields belong to each Rectangle object.
    // Every rectangle has its own width and height stored here.
    private double width;
    private double height;

    // The constructor receives width and height from whoever creates the Rectangle.
    // 'this.width' refers to the object's field.
    // 'width' refers to the constructor parameter.
    Rectangle(double width, double height) {
        this.width = width;   // Store the provided width in the object's width field
        this.height = height; // Store the provided height in the object's height field
    }

    // This method overrides the version in Shape.
    // Shape defines the idea of "area", but Rectangle provides the actual formula.
    @Override
    double area() {
        // The mathematical formula for a rectangle's area.
        return width * height;
    }
}