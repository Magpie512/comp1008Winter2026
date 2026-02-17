package practice.q4;
//Ask the user to enter 5 numbers and store them in an array. Print the total sum.
        
public class q42 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // Makes a variable numbers which is an array of integers with a length of 5
        int sum = 0;

        System.out.println("Enter 5 numbers:");
        System.out.println("-----------------");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new java.util.Scanner(System.in).nextInt();
            sum += numbers[i];
        }
        // every iteration of the loop, it adds the current number to the sum variable

            System.out.println("-----------------");
            System.out.println("The total sum is: " + sum);
        }
    }
