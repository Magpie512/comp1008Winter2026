import java.io.*;
import java.util.Scanner;

public class attempt {
    public static void main(String[] args) {

        // The fix to my issue
        System.out.println("Working directory: " + new File(".").getAbsolutePath());
        System.out.println("Before continuing make sure the files exist. Thanks.");
        System.out.println("Case sensitive and the output file will be overwritten.\n");

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the name of the first file: ");
            String file1 = scanner.nextLine().trim();

            System.out.print("Enter the name of the second file: ");
            String file2 = scanner.nextLine().trim();

            System.out.print("Enter the name of the output file: ");
            String outputFile = scanner.nextLine().trim();

            File input1 = new File(file1);
            File input2 = new File(file2);

            if (!input1.exists()) {
                System.out.println("Error: The file \"" + file1 + "\" does not exist.");
                return;
            }

            if (!input2.exists()) {
                System.out.println("Error: The file \"" + file2 + "\" does not exist.");
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
                System.out.println("An error occurred while processing the files.");
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
}