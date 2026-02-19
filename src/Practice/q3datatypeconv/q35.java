package practice.q3datatypeconv;
//Question 3.5
//Ask the user for a character as a String. Convert it to a float and print it.
public class q35 {
    // floats can only store 6-7 digits, so if the user enters a character that is not a number, it will be converted to 0.0
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a character: ");
        String character = input.nextLine();
        float result = Float.parseFloat(character);
        System.out.println("Converted to float: " + result);
    }
}
