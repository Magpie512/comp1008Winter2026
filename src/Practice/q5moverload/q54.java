package practice.q5moverload;
        //Create overloaded convert() methods:
        //One converts int to double
        //One converts double to int
public class q54 {
    
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(5.5));
    }

    // Method to convert int to double
    public static double convert(int num) {
        return (double) num;
    }

    // Method to convert double to int
    public static int convert(double num) {
        return (int) num;
    }
}
