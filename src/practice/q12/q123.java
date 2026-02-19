package practice.q12;
    //Create an array of 5 integers.
    //Ask the user to enter an index number.
    //Use a try-catch block to handle ArrayIndexOutOfBoundsException.
    //If the index is invalid, print: Invalid index!

public class q123 {
    public static void main(String[] args) {
        int[] array = new int[5];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter an index: ");
        try {
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }

        scanner.close();
    }
}
