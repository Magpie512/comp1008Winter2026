// Gen one
package wk11;

public abstract class Shape { 
// abstract is a restrictive class that cannot be used to make classes

    private String name;

    public String getName() {
        return name;
    }

    // Setter for name
    // this.name is the local variable
    public void setName(String name) {
        this.name = name;
    }

    // Constructor with nothing is a default
    public Shape(){}

    // Constructor for name
    public Shape(String name){
        setName(name);
    }

    public abstract double area();
    // An abstract method is a method that has no body
    // The body is provided by the subclass

    public abstract double perimeter();

}
