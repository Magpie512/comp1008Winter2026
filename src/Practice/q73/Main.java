package practice.q73;
        //Question 7.3
        //Write a program that calculates and prints the sum of numbers from 1 to 100 using a for loop.

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);
    }
}