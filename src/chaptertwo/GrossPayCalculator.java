package chaptertwo;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg []){
        Scanner scanner = new Scanner(System.in);
        GrossPayCalculator grossPayCalculator = new GrossPayCalculator();
         //* Get the number of hours worked
        int numberOfHours = grossPayCalculator.getNumberOfHours(scanner);
        //* Get the hourly pay rate
        double rate = grossPayCalculator.getRate(scanner);
        //* Multiple hours and pay rate
        grossPayCalculator.calculateSalary(scanner, numberOfHours, rate);

    }

    private void calculateSalary(Scanner scanner, int numberOfHours, double rate) {
        double salary = numberOfHours * rate;
        scanner.close();
        //* Display result
        System.out.println("You salary is = " + salary + "$");
    }

    private int getNumberOfHours(Scanner scanner) {
        System.out.println("Enter the number of hours the employee worked");
        int numberOfHours = scanner.nextInt();
        return numberOfHours;
    }

    private double getRate(Scanner scanner) {
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        return rate;
    }
}
