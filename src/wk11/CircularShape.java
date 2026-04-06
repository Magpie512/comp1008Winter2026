package wk11;
public abstract class CircularShape extends Shape{

    //constant value
    public static final double PI = Math.PI;

    private double radius, diameter;

    public CircularShape() {}

    public CircularShape(String name, double radius){
        this(name, radius, radius * 2);
    }

    public CircularShape(String name, double radius, double diameter){
        super(name);
        setRadius(radius);
        setDiameter(radius * 2);

    }

    /**
     * Returns the radius of the circular shape
     * @return the radius of the circular shape
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circular shape.
     * @param radius the radius of the circular shape
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the diameter of the circular shape
     * @return the diameter of the circular shape
     */
    public double getDiameter() {
        return diameter;
    }

    /**
     * Sets the diameter of the circular shape.
     * @param diameter the diameter of the circular shape
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public abstract double circumference();
}