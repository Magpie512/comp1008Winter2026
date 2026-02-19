package practice.q4arrays;
//Create an integer array and count how many even numbers it contains.
public class q45 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10,11};
        int counter = 0;

        for (int i = 0; i <array.length; i++){
            if (array[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println("The number of even numbers is: " + counter);
    }
}
