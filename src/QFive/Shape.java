package QFive;

public abstract class Shape {
    protected String name;

    protected Shape(String name) {
        this.name = name;
    }

    public abstract double area();
}
