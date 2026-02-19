package practice.q11;
        //Question 11.2
        //Create a method: public int getLength(String text)
        //Write JUnit tests to verify: 
        //"Hello" returns 5
        //"" returns 0
public class q112 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("getLength(\"Hello\") = " + calculator.getLength("Hello")); // Should print 5
        System.out.println("getLength(\"\") = " + calculator.getLength("")); // Should print 0
    }
}
