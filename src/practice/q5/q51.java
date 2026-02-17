package practice.q5;
//Create two methods named multiply():
//One takes two integers
//One takes three integers
public class q51 {
    public static void main(String[] args) {
        System.out.println(multiply(2, 3));
        System.out.println(multiply(2, 3, 4));
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
