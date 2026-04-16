package QFive;

public class Rectangle extends Shape{
    protected double height;
    protected double width;

    public Rectangle(double width, double height){
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }


}
