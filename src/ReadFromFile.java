import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public void execute() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"))) {
            String line;
            System.out.println("[ReadFromFile] File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}