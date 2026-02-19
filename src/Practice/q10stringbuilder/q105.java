package practice.q10stringbuilder;
        //Create a StringBuilder with: "I like cats"
        //Replace "cats" with "dogs" using the replace() method.
        //11. JUnit Testing
        //Create a class named Calculator. 
        //Each question below will ask you to create a method in the Calculator class and to test it.
public class q105 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like cats");
        int start = sb.indexOf("cats");
        int end = start + "cats".length();
        sb.replace(start, end, "dogs");
        System.out.println(sb.toString());
    }
}
