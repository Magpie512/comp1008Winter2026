package practice.q9regex;
import java.util.Scanner;
        //Question 9.3
        //Write a program that checks if a name:
        //Starts with a capital letter
        //Followed by only lowercase letters
        //Has no spaces
        //Example valid input: Michael
        //Invalid: michael, MICHAEL, Michael1
public class q93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();v

        if (name.matches("[A-Z][a-z]*")) {
            System.out.println("Valid name.");
        } else {
            System.out.println("Invalid name. It should start with a capital letter followed by only lowercase letters and contain no spaces.");
        }
        scanner.close();
    }
}
