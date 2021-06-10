package chapter4;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class HomeAreaRedo {

   Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaRedo homeArea = new HomeAreaRedo();
        Rectangle kitchen = homeArea.getRoom();
        Rectangle bathroom = homeArea.getRoom();

        double area = homeArea.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area of the house is " + area);

        homeArea.scanner.close();
    }

    /**
     * Calculates the total area
     * @param rect1
     * @param rect2
     * @return double
     */
    private double calculateTotalArea(@NotNull Rectangle rect1, @NotNull Rectangle rect2) {
        return  rect1.calculateArea() + rect2.calculateArea();
    }

    /**
     * Asks the user for length and width of a room
     * @return Rectangle Object
     */
    public Rectangle getRoom() {


        System.out.println("Please enter the length of the room");
        double length = scanner.nextDouble();

        System.out.println("Please enter the width of the room");
        double width= scanner.nextDouble();


        return new Rectangle(length,width);
    }
}
