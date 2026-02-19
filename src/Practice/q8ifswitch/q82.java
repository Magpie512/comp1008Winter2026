package practice.q8ifswitch;
import java.util.Scanner;
        //Question 8.2 
        //Ask the user to enter a test mark (0–100).
        //Display the grade:
        //75–100 → Distinction
        //50–74 → Pass
        //0–49 → Fail
public class q82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a test mark (0-100): ");
        int mark = scanner.nextInt();

        if (mark >= 75 && mark <= 100) {
            System.out.println("Grade: Distinction");
        } else if (mark >= 50 && mark < 75) {
            System.out.println("Grade: Pass");
        } else if (mark >= 0 && mark < 50) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid mark. Please enter a number between 0 and 100.");
        }

        scanner.close();
    }
}
