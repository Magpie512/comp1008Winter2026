package practice.q3datatypeconv;
//Question 3.4
//Convert an integer into a double and concatenate it with a sentence.

public class q34 {
    public static void main(String[] args) {
        int num = 42;
        double convertedNum = (double) num; // Convert integer to double
        String sentence = "The converted number is: " + convertedNum; // Concatenate with a sentence
        System.out.println(sentence); // Output the result
    }
}
