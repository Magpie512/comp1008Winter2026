import java.io.*;
import java.util.Scanner;

public class FileMerger {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Before continuing make sure the files exist. Thanks.");
            System.out.println("Case sensitive and the output file will be overwritten.");

            System.out.print("Enter the name of the first file: ");
            String file1 = scanner.nextLine();

            System.out.print("Enter the name of the second file: ");
            String file2 = scanner.nextLine();

            System.out.print("Enter the name of the output file: ");
            String outputFile = scanner.nextLine();

            File input1 = new File(file1);
            File input2 = new File(file2);

            if (!input1.exists()) {
                System.out.println("Error Occurred: The file \"" + file1 + "\" doesn't exist.");
                return;
            }

            if (!input2.exists()) {
                System.out.println("Error Occurred: The file \"" + file2 + "\" doesn't exist.");
                return;
            }

            int totalLines = 0;

            try (
                BufferedReader reader1 = new BufferedReader(new FileReader(input1));
                BufferedReader reader2 = new BufferedReader(new FileReader(input2));
                PrintWriter writer = new PrintWriter(new FileWriter(outputFile))
            ) {
                String line;

                while ((line = reader1.readLine()) != null) {
                    writer.println(line);
                    totalLines++;
                }

                while ((line = reader2.readLine()) != null) {
                    writer.println(line);
                    totalLines++;
                }

                System.out.println("\nMerge completed successfully!");
                System.out.println("Total lines written: " + totalLines);
                System.out.println("Output saved to: " + outputFile);

            } catch (IOException e) {
                System.out.println("An error has occurred while processing the files.");
                System.out.println("Error: " + e.getMessage() + "\n");
            }

        }
    }
}