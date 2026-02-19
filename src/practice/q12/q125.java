package practice.q12;
        //Question 12.5
        //Write a program that:
        //Uses a try-catch-finally block.
        //In the try block, attempt to divide two numbers.
        //In the catch block, print an error message.
        //In the finally block, print: Program finished.
        //The finally message must print whether an exception occurs or not.

public class q125 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Program finished.");
        }

        scanner.close();
    }
}
