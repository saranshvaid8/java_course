package chapter4;

/**
 * Write a class that creates instances of the Rectangle class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String[] args) {

        /******************
         * Rectangle with parameterless constructor
         ******************/
         Rectangle roomOne = new Rectangle();
         roomOne.setWidth(10);
         roomOne.setLength(20);
         double areaOfRoomOne = roomOne.calculateArea();
         double perimeterOfRoomOne = roomOne.calculatePerimeter();

        /*****************
         * Rectangle with parameterized constructor
         *****************/
        Rectangle roomTwo = new Rectangle(30,20);
        double areaOfRoomTwo = roomTwo.calculateArea();
        double perimeterOfRoomTwo = roomTwo.calculatePerimeter();

        double totalArea = areaOfRoomOne + areaOfRoomTwo;
        double totalPerimeter= perimeterOfRoomOne+perimeterOfRoomTwo;

        System.out.println("Area of the house is "+ totalArea);
        System.out.println("Perimeter of the house is " + totalPerimeter);
    }
}
