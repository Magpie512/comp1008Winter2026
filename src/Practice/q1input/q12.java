package practice.q1input;

import java.util.Scanner;

public class q12 {
    //Question 1.2
    //Write a program that asks the user to enter two integers and prints their product.
    static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the first integer:");
            int num1 = input.nextInt();
            System.out.println("Please enter the second integer:");
            int num2 = input.nextInt();
            int product = num1 * num2;
            System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        }
    }
}
