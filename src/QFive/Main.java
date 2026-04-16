package QFive;

public class Main {
    static void main(String[] args) {
        /* a polymorphic arrray?? */
        Shape[] shapes = {
                new Circle(2.0),
                new Rectangle(2.0, 4.0)
        };
        /* is this a foreach loop? */
        for (Shape s : shapes) {
            System.out.println(s.area());
        }
    }
}
