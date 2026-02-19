package practice.q11;
        //Question 11.3
        //Create a method: public boolean isEven(int number)
        //Write JUnit tests to check:
        //4 returns true
        //7 returns false
public class q113 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("isEven(4) = " + calculator.isEven(4)); // Should print true
        System.out.println("isEven(7) = " + calculator.isEven(7)); // Should print false
    }
}
