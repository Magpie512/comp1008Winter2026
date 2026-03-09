import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public void execute() {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, Java File Handling!");
            System.out.println("[WriteToFile] Write complete.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}