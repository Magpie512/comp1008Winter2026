import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public void execute() {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("notes.txt"))) {
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("[CountLines] Number of lines: " + count);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}