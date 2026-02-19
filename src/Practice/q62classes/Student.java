package practice.q62classes;
        //Create a Student class with:
        //private name
        //private grade
        //Use getters and setters.
        //Create an array of 3 students and print their details.
    public class Student {
        private String name;
        private double grade;
        // Getter for name
        public String getName() {
            return name;
            // Return the value of the name variable
        }
        
        // Getter for grade
        public double getGrade() {
            return grade;
            // Return the value of the grade variable
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
            // Set the value of the name variable
        }

        // Setter for grade
        public void setGrade(double grade) {
            this.grade = grade;
            // Set the value of the grade variable
        }

        
    }