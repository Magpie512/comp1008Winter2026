package practice.q4;
//Create an array of names and print the longest name.
public class q44 {
    public static void main(String[] args) {
        String[] namesArray = {"Alice", "Bob", "Catherine", "David", "Eleanor"};
        String longestName = "";
        //line 6 is the declaration of the longestName variable, which is initialized to an empty string. This variable will be used to keep track of the longest name found in the namesArray.

        for (String name : namesArray) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        // for every name in the namesArray, the code checks if the length of the current name is greater than the length of the longestName found so far. If it is, longestName is updated to the current name.

        System.out.println("The longest name is: " + longestName);
    }
}
