package practice.q62classes;
        //Create a Student class with:
        //private name
        //private grade
        //Use getters and setters.
        //Create an array of 3 students and print their details.
public class Main {
    public static void main(String[] args) {
        Student[] studentinfo = new Student[3];
        // Create an array of 3 Student objects
        // 

        // Initialize each Student object and set their details
        studentinfo[0] = new Student();
        studentinfo[0].setName("Alice");
        studentinfo[0].setGrade(85.5);

        studentinfo[1] = new Student();
        studentinfo[1].setName("Bob");
        studentinfo[1].setGrade(92.0);

        studentinfo[2] = new Student();
        studentinfo[2].setName("Charlie");
        studentinfo[2].setGrade(78.0);

        // Print the details of each student
        for (Student students : studentinfo) {
            // for in the array Student
            // students is the variable that holds each Student object in the array
            System.out.println("Name: " + students.getName());
            System.out.println("Grade: " + students.getGrade());
            System.out.println(); // Print a blank line for better readability
        }
    }
}
