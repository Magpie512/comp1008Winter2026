package QThree;

public class Printer {
    void print(String text){
        System.out.println("String version: " + text);
    };
    void print(int number) {
        System.out.println("int version: " + number);
    };
    void print(double number){
        System.out.println("double version: " + number);
    };

    public static void main(String[] args) {
        Printer jobOne = new Printer();
        jobOne.print("V1");
        jobOne.print(1);
        jobOne.print(1.1);
        System.out.println();

        Printer jobTwo = new Printer();
        jobTwo.print("V2");
        jobTwo.print(2);
        jobTwo.print(2.2);
        System.out.println();

        Printer jobThree = new Printer();
        jobThree.print("V3");
        jobThree.print(3);
        jobThree.print(3.3);
        System.out.println();
    }
}