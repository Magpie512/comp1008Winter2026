package practice.q63;
//Question 6.3
//Create an enum called Level:
//BEGINNER
//INTERMEDIATE
//ADVANCED
//Create a Course class that includes this enum as a field.
public class Main {
    public static void main(String[] args) {
        // Create instances of the Course class with different levels and print their details.

        // Course1 is a beginner level course on Java Programming
        Course course1 = new Course("Java Programming", Level.BEGINNER);

        // Course2 is an intermediate level course on Data Structures
        Course course2 = new Course("Data Structures", Level.INTERMEDIATE);

        // Course3 is an advanced level course on Machine Learning
        Course course3 = new Course("Machine Learning", Level.ADVANCED);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
