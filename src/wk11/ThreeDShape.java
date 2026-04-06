
package wk11;

public abstract class ThreeDShape extends Shape {

    private double depth;

    /**
     * Returns the depth of the 3D shape
     * @return the depth of the 3D shape
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Sets the depth of the 3D shape
     * @param depth the depth of the 3D shape
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    public abstract double volume();
}
