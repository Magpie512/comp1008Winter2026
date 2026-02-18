package practice.q63;
//Question 6.3
//Create an enum called Level:
//BEGINNER
//INTERMEDIATE
//ADVANCED
//Create a Course class that includes this enum as a field.
public class Course {
    // Enumerators are a special type of class that represents a group of constants (unchangeable variables, like final variables).
        public enum Level {
        BEGINNER,
        INTERMEDIATE,
        ADVANCED
    }
    private String courseName;
    private Level courseLevel;

    // Getter for courseName
    public String getCourseName() {
        return courseName;
        // Return the value of the courseName variable
    }

    // Getter for courseLevel
    public Level getCourseLevel() {
        return courseLevel;
        // Return the value of the courseLevel variable
    }

    // Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
        // Set the value of the courseName variable
    }

    // Setter for courseLevel
    public void setCourseLevel(Level courseLevel) {
        this.courseLevel = courseLevel;
        // Set the value of the courseLevel variable
    }
}
