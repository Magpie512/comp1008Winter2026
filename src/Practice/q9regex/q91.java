package practice.q9regex;
import java.util.Scanner;
        //Question 9.1
        //Write a Java program that checks if a student number:
        //Starts with "ST"
        //Followed by exactly 4 digits
        //Example of valid input: ST1234
        //Invalid examples: st1234, ST12, ST12345
public class q91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student number: ");
        String studentNumber = scanner.nextLine();

        if (studentNumber.matches("ST\\d{4}")) {
            System.out.println("Valid student number.");
        } else {
            System.out.println("Invalid student number. It should start with 'ST' followed by exactly 4 digits.");
        }

        scanner.close();
    }
}
