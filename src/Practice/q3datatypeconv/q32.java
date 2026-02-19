package practice.q3datatypeconv;

public class q32 {
    //Question 3.2
    //Convert a double value (e.g., 5.75) into an integer and print both values.
    public static void main(String[] args) {
        //Convert a double value (e.g., 5.75) into an integer
        double doubleValue = 5.75;
        int intValue = (int) doubleValue;

        System.out.println("Double value: " + doubleValue);
        // Doubles can print out decimals. its what theyre for
        System.out.println("Integer value: " + intValue);
        // Integers output only the integer part of the number
    }
}
