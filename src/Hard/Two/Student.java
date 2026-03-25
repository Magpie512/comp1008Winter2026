package Hard.Two;

public class Student extends Person{
    String studentId;

    Student(String name, int age, String studentId) {
        super(name,age); // calls person constructor
        this.studentId = studentId;
    }
}
