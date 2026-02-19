package practice.q9regex;
        //Question 9.4 
        //Write a program that checks if a product code:
        //Contains 3 uppercase letters
        //Followed by a dash (-)
        //Followed by 3 digits
        //Example valid input: ABC-123
public class q94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a product code: ");
        String productCode = scanner.nextLine();

        if (productCode.matches("[A-Z]{3}-\\d{3}")) {
            System.out.println("Valid product code.");
        } else {
            System.out.println("Invalid product code. It should contain 3 uppercase letters followed by a dash and 3 digits.");
        }
    }
}
