package practice.q11;
        //Question 11.4
        //Create a method: public double divide(int a, int b)
        //Write a JUnit test that:
        //Verifies correct division result
        //Tests that dividing by 0 throws an exception
public class q114 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("divide(10, 2) = " + calculator.divide(10, 2)); // Should print 5.0
        try {
            System.out.println("divide(10, 0) = " + calculator.divide(10, 0)); // Should throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
