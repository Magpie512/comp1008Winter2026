package practice.q63classes;
//Question 6.3
//Create an enum called Level:
//BEGINNER
//INTERMEDIATE
//ADVANCED
//Create a Course class that includes this enum as 
// a field.
public class Course {
    public enum Level {
        BEGINNER,
        INTERMEDIATE,
        ADVANCED
    }
    
    private String courseName;
    private Level courseLevel;

    public Course(String courseName, Level courseLevel) {
        this.courseName = courseName;
        this.courseLevel = courseLevel;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Level getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(Level courseLevel) {
        this.courseLevel = courseLevel;
    }
}