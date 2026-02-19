package practice.q12;
    //Question 12.2
    //Write a program that:
    //Asks the user to enter an integer.
    //Uses a try-catch block to handle invalid input (e.g., letters instead of numbers).
    //If invalid input is entered, print: Invalid number entered.

public class q122 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter an integer: ");
        try {
            int num = scanner.nextInt();
            System.out.println("You entered: " + num);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid number entered.");
        }

        scanner.close();
    }
}
