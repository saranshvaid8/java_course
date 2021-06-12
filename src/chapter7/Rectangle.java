package chapter7;

public class Rectangle {

    //<editor-fold desc="Members">
    private double length;
    private double width;
    private double sides = 4;
    //</editor-fold>

    //<editor-fold desc="Getters & Setters">
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }
    //</editor-fold>

    //<editor-fold desc="Methods">

    /**
     * Calculates the perimeter
     * @return double
     */
    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }
    //</editor-fold>
}
