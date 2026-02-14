package Practice;

import java.util.Scanner;

public class q15 {

    //Question 1.5
    //Write a program that asks the user for:
    //Name
    //Age
    //Height
    //Then display all the information neatly formatted.
    static void main( String[] args){

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please type out your name: ");
        String name = Scanner.nextLine();
        System.out.println("Please type out your age: ");
        int age = Scanner.nextInt();
        System.out.println("Please type out your height: ");
        double height = Scanner.nextDouble();
        System.out.println("Your name is " + name + ", you are " + age + " years old, and you are " + height + " tall. Whether that is in imperial or metric is up to you.");
    }
}