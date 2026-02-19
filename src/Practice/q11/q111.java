package practice.q11;
        //Question 11.1 
        //Create a method: public int add(int a, int b)
        //Write a JUnit test that verifies:
        //add(2, 3) returns 5
        //add(-1, 1) returns 0
public class q111 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("add(2, 3) = " + calculator.add(2, 3)); // Should print 5
        System.out.println("add(-1, 1) = " + calculator.add(-1, 1)); // Should print 0
    }
}
