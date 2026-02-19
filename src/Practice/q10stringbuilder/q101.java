package practice.q10stringbuilder;
        //Question 10.1
        //Write a program that:
        //Creates a StringBuilder
        //Appends your first name
        //Appends a space
        //Appends your last name
        //Prints the final result
public class q101 {
    public static void main(String[] args) {
        StringBuilder fullName = new StringBuilder();
        fullName.append("Amara");
        fullName.append(" ");
        fullName.append("Smith");

        System.out.println("Full name: " + fullName.toString());
    }
}
