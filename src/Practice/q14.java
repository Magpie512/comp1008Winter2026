package practice;

//Write a program that asks the user to enter 3 words separately and prints them on one line separated by commas.
//q14.main(args);

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String wordPattern = "^[a-zA-Z]+$";

            System.out.print("Please provide a word: ");
            String word1 = scanner.nextLine();

            if (!word1.matches(wordPattern)) {
                System.out.println("Invalid input. Please enter a word containing only letters.");
                return;
            }
            
            System.out.print("Please provide a word: ");
            String word2 = scanner.nextLine();

            if (!word2.matches(wordPattern)) {
                System.out.println("Invalid input. Please enter a word containing only letters.");
                return;
            }
            
            System.out.print("Please provide a word: ");
            String word3 = scanner.nextLine();

            if (!word3.matches(wordPattern)) {
                System.out.println("Invalid input. Please enter a word containing only letters.");
                return;
            }
            
            System.out.println(word1 + ", " + word2 + ", " + word3);
        }
    }
}
