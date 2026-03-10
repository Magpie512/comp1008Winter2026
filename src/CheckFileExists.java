import java.io.File;

public class CheckFileExists {
    public void execute() {
        File file = new File("src/data.txt");

        if (file.exists()) {
            System.out.println("[CheckFileExists] File exists");
        } else {
            System.out.println("[CheckFileExists] File not found");
        }
    }
}