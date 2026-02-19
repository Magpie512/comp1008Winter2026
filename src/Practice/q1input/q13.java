package practice.q1input;

import java.util.Scanner;

public class q13 {
    //Question 1.3
    //Write a program that asks the user to enter a decimal number and prints its square

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a decimal number.");
        double num = input.nextDouble();
        double square = num * num;
        System.out.println("The square of " + num + " is " + square);
        input.close();
    }
}
