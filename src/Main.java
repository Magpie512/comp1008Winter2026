public class Main {
    public static void main(String[] args) {

        // These classes already exist in your project
        WriteToFile write = new WriteToFile();
        ReadFromFile read = new ReadFromFile();
        CheckFileExists check = new CheckFileExists();
        CountLines count = new CountLines();
        CopyFile copy = new CopyFile();

        // Main calls the objects
        write.execute();
        read.execute();
        check.execute();
        count.execute();
        copy.execute();
    }
}