package easy.three;

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);     // call the Shape constructor
        this.radius = radius;
    }
}