package practice.q10stringbuilder;
        //Question 10.4
        //Create a StringBuilder containing: HelloWorld
        //Remove the word "World" using the delete() method and print the result.
public class q104 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWorld");
        sb.delete(5, 10); // Remove "World"
        System.out.println(sb.toString());
    }
}
