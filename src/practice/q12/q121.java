package practice.q12;
        //Question 12.1
        //Write a program that:
        //Asks the user to enter two integers.
        //Divides the first number by the second.
        //Uses a try-catch block to handle division by zero.
        //If division by zero occurs, print: Cannot divide by zero!

public class q121 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        scanner.close();
    }
}
