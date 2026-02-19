package practice.q3datatypeconv;
//Question 3.1
//Ask the user to enter their age as a String. Convert it to an integer and print next year's age.

public class q31 {
    public static void main(String[] args) {
        //Import Scanner
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //Ask the user to enter their age as a String
        System.out.print("Please enter your age: ");
        String ageString = scanner.nextLine();

        //Convert it to an integer
        int age = Integer.parseInt(ageString);

        //Print next year's age
        int nextYearAge = age + 1;
        System.out.println("Next year, you will be: " + nextYearAge + " years old.");

        //Close the scanner
        scanner.close();
    }
}
