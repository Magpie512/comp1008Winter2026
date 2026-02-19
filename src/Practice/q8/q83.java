package practice.q8;
        //Question 8.3 
        //Ask the user for their age and whether they have a driver's license (true/false).
        //Only allow them to rent a car if:
        //They are 21 or older
        //AND they have a license
        //Otherwise, print "Not eligible".
public class q83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a driver's license? (true/false): ");
        boolean hasLicense = scanner.nextBoolean();

        if (age >= 21 && hasLicense) {
            System.out.println("You are eligible to rent a car.");
        } else {
            System.out.println("Not eligible.");
        }
    }
}
