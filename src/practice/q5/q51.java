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
    // The first method takes two integers and returns their product. The second method takes three integers and returns their product. The main method demonstrates the use of both methods by calling them with sample integer values and printing the results.

    // The reason line 1p and line 13 are different is because they are method signatures. The first method signature is for the method that takes two integers, while the second method signature is for the method that takes three integers. The method signatures must be different in order for the Java compiler to distinguish between the two methods when they are called. This is known as method overloading, which allows multiple methods to have the same name but different parameter lists.
}
