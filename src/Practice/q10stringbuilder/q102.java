package practice.q10stringbuilder;
import java.util.Scanner;
        //Question 10.2
        //Write a program that:
        //Asks the user to enter a word
        //Uses StringBuilder to reverse the word
        //Prints the reversed word
public class q102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        StringBuilder reversedWord = new StringBuilder(word);
        reversedWord.reverse();

        System.out.println("Reversed word: " + reversedWord.toString());
    }
}
