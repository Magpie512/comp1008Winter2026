// Gen one
package wk11;

public abstract class Shape { 
// abstract is a restrictive class that cannot be used to make classes

    private String name;

    /**
     * Returns the name of the shape
     * @return the name of the shape
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the shape
     * @param name the name of the shape
     */
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
