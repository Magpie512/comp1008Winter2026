package practice.q9regex;
        //Question 9.5
        //Write a program that checks if a date is in the format: DD/MM/YYYY
        //Rules:
        //2 digits for day
        //2 digits for month
        //4 digits for year
        //Must include slashes
        //Example: 25/12/2025
        //(Note: You do NOT need to validate real calendar dates, only the format.)
public class q95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (DD/MM/YYYY): ");
        String date = scanner.nextLine();

        if (date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("Valid date format.");
        } else {
            System.out.println("Invalid date format. It should be in the format DD/MM/YYYY.");
        }
    }
}
