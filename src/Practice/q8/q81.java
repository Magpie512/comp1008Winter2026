package practice.q8;
        //Question 8.1 
        //Write a program that asks the user to enter a number.
        //If the number is positive, print "Positive".
        //If negative, print "Negative".
        //If zero, print "Zero".
public class q81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
