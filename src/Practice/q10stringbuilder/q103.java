package practice.q10stringbuilder;
        //Question 10.3
        //Create a StringBuilder with the word "Java"
        //Insert the word "Programming " at the beginning so the final result becomes: "Programming Java"
public class q103 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.insert(0, "Programming ");
        System.out.println(sb.toString());
    }
}
