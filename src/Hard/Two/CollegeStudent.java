package Hard.Two;

public class CollegeStudent extends Student{
    String major;
    int year;

    CollegeStudent(String name, int age, String studentId, String major, int year){
        super(name, age, studentId);   // calls Student → Person
        this.major = major;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("Year: " + year);
    }
}
