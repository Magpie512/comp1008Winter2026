package QFive;
import java.lang.Math; /* jesus christ its jason borne */

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
}
