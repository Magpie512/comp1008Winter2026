package practice.q74loops;
        //Question 7.4
        //Write a program that keeps asking the user to enter a number until they enter 0.
        //When 0 is entered, print the total sum of all numbers entered.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (0 to quit): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Total sum of numbers entered: " + sum);
    }
}
