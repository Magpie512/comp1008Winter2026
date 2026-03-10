import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public void execute() {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("src/source.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/destination.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("[CopyFile] Copy complete.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}