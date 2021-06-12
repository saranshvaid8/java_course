package chapter7;

import java.util.Arrays;

public class ShapeTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(11.32);
        rectangle.setWidth(12.43);


        Square square = new Square();
        square.setLength(10.21);
        square.setWidth(10);

        var resultOfSquare = square.calculatePerimeter();
        var resultOfRect = rectangle.calculatePerimeter();

        System.out.println(String.format("The perimeter of rectangle is %.2f:  ",resultOfRect));
        System.out.println(String.format("The perimeter of square is %.2f:  ",resultOfSquare));
    }
}
