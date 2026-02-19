package practice.q5moverload;
        //Create overloaded area() methods:
        //One calculates area of a square
        //One calculates area of a rectangle
public class q53 {
    public static void main(String[] args) {
        
        System.out.println(area(5));
        System.out.println(area(5, 10));
    }
    // Method to calculate area of a square
    public static int area(int side) {
        return side * side;
    }
    // Method to calculate area of a rectangle
    public static int area(int length, int width) {
        return length * width;
    }
}
