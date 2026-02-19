package practice.q4arrays;
//Create an array of 5 double values and print the average.
public class q43 {
    
    public static void main(String[] args) {
        double[] valueArray = {10.5, 20.3, 30.7, 40.2, 50.1};
        double sum = 0;

        for (double additionsToSum : valueArray) {
            sum += additionsToSum;
        }
        

        double average = sum / valueArray.length;
        System.out.println("The average is: " + average);
    }
}
