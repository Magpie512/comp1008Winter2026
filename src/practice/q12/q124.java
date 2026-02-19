package practice.q12;
        //Question 12.4
        //Write a program that:
        //Asks the user for two numbers.
        //Divides them.
        //Uses multiple catch blocks to handle:
        //ArithmeticException and InputMismatchException
        //Print appropriate error messages for each exception.
public class q124 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first number: ");
        try {
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid number entered.");
        }

        scanner.close();
    }
}
