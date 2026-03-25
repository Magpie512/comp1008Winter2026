package Hard.Twenty;

public class Triangle extends Polygon{
    private double a,b,c;

    public Triangle(double a, double b, double c){
        super(3);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter(){
        return a + b + c;
    }

    @Override
    public double area(){
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
