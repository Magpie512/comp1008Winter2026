package practice.q3datatypeconv;
//Question 3.3
//Ask the user for two numbers as Strings. Convert them to doubles and print their average.

// import for Scanner
//import java.util.Scanner;

public class q33 {

    public static void main(String[] args) {
        // Import Scanners due to the fact that we are not importing the entire java.util package in this file

        // Instead we will import the Scanner class directly
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //Ask the user for two numbers as Strings
        System.out.print("Please enter the first number: ");
        String firstNumberString = scanner.nextLine();
        System.out.print("Please enter the second number: ");
        String secondNumberString = scanner.nextLine();

        //Convert them to doubles
        double firstNumber = Double.parseDouble(firstNumberString);
        double secondNumber = Double.parseDouble(secondNumberString);

        //Calculate and print the average
        double average = (firstNumber + secondNumber) / 2;
        System.out.println("The average is: " + average);

        //Close the scanner
        scanner.close();
    }
}
