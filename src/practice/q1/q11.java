package practice.q1;

import java.util.Scanner;

public class q11 {
    //Question 1.1
    //Write a program that asks the user to enter their full name and prints it back.
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter your full name:");
            String fullname = input.nextLine();
            System.out.println(fullname);
        }
    }
}