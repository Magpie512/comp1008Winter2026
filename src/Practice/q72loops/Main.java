package practice.q72loops;
        //Question 7.2
        //Write a program that uses a while loop to print numbers from 10 down to 1.

public class Main {
    public static void main(String[] args) {
        int number = 10;
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
