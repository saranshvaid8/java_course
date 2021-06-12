package chapter7;

public class Square extends Rectangle{

    //<editor-fold desc="Methods">

    /**
     * Calculates the perimeter with the formula sides * length
     * @return double
     */
    @Override
    public double calculatePerimeter() {
        return getSides()* getLength();
    }
    //</editor-fold>
}
