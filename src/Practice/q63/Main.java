package practice.q63;
//Question 6.3
//Create an enum called Level:
//BEGINNER
//INTERMEDIATE
//ADVANCED
//Create a Course class that includes this enum as a field.

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", Course.Level.BEGINNER);
        Course course2 = new Course("Data Structures", Course.Level.INTERMEDIATE);
        Course course3 = new Course("Algorithms", Course.Level.ADVANCED);

        System.out.println(course1.getCourseName() + " - " + course1.getCourseLevel());
        System.out.println(course2.getCourseName() + " - " + course2.getCourseLevel());
        System.out.println(course3.getCourseName() + " - " + course3.getCourseLevel());
    }
}