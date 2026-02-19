package practice.q4arrays;
//Create an array of 5 integers and print all elements using a loop.

public class q41 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // i is zero
        // while i is less than the length of the array
        // print the element at index i
        // increment i by 1


        // Alternatively, you can use an enhanced for loop:
        // for (int num : array) {
        //     System.out.println(num);
        // }
    }
}