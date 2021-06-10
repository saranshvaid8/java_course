package chapter4;

public class Rectangle {

    private double length;
    private double width;

    //region Constructors
    public Rectangle(double length, double width) {
       this.setLength(length);
       this.setWidth(width);
    }

    public Rectangle() {
        this.setLength(0);
        this.setWidth(0);
    }
    //endregion



    //<editor-fold desc="Properties">
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
    //</editor-fold>

    //<editor-fold desc="Methods">

    /**
     * Calculates perimeter
     * @return double
     */
    public double calculatePerimeter(){
        return (2*length) + (2*width);
    }

    /**
     * Calculates the area
     * @return double
     */
    public double calculateArea(){
        return length * width;
    }
    //</editor-fold>
}
