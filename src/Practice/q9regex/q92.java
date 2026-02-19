package practice.q9regex;
        //Question 9.2
        //Write a program that checks if a username:
        //Is between 5 and 10 characters long
        //Contains only: Letters, Numbers, Underscores (_)
        //Print "Valid username" or "Invalid username".
public class q92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (username.matches("[a-zA-Z0-9_]{5,10}")) {
            System.out.println("Valid username.");
        } else {
            System.out.println("Invalid username. It should be 5-10 characters long and contain only letters, numbers, or underscores.");
        }
    }
}
