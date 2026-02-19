package practice.q75;
        //Question 7.5
        //Create an array of 5 integers.
        //Use an enhanced for loop to:
        //Print each number
        //Calculate and print the average

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        System.out.println("Numbers in the array:");
        for (int num : numbers) {
            System.out.println(num);
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
