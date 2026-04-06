package wk11;

public class Rectangle extends Shape{
    //inherits from super class Shape

    private double length, width;
    // set length and width with private variables

    /**
     * Returns the length of the rectangle
     * @return the length of the rectangle
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length of the rectangle
     * @param length the length of the rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Returns the width of the rectangle
     * @return the width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle
     * @param width the width of the rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){} // default constructor for Rectangle

    public Rectangle(String name, double length, double width) {
        super(name);
        setLength(length);
        setWidth(width);
    }

    /**
     * Calculates the perimeter of the rectangle.
     * The perimeter of a rectangle is 2 x (length + width)
     * @return the perimeter of the rectangle
     */
    @Override
    public double perimeter(){
        return 2 * (length + width);
    }
    /**
     * Returns the area of the rectangle
     * The area of a rectangle is length * width
     * @return the area of the rectangle
     */
    @Override
    public double area(){
        return length * width;
    }
}