package chapter3;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg []){
        Scanner scanner = new Scanner(System.in);
        GrossPayCalculator grossPayCalculator = new GrossPayCalculator();

        int numberOfHours = grossPayCalculator.getNumberOfHours(scanner);
        double rate = grossPayCalculator.getRate(scanner);
        grossPayCalculator.calculateSalary(scanner, numberOfHours, rate);

    }

    /**
     * Calculates Salary
     * @param scanner
     * @param numberOfHours
     * @param rate
     */
    private void calculateSalary(Scanner scanner, int numberOfHours, double rate) {

        double salary = numberOfHours * rate;
        int bonusEligibleHours = 80;
        double bonusEligiblePayRate = 30;
        int bonusAmount = 300;
        if (numberOfHours > bonusEligibleHours && rate < bonusEligibleHours) {
            System.out.println(String.format("Daam! you worked for %d hours. Wow you really love your work and you deserve a bonus of %d $", numberOfHours, bonusAmount));
            salary = salary + bonusAmount;
        }

        scanner.close();
        System.out.println("You salary is = " + salary + "$");
    }

    /**
     * Gets the number of hours
     * @param scanner
     * @return int
     */
    private int getNumberOfHours(Scanner scanner) {
        System.out.println("Enter the number of hours the employee worked");
        int numberOfHours = scanner.nextInt();
        if (numberOfHours > 40) {
            System.out.println(String.format("You have worked for %d hrs, which is above 40 hrs.This means you are eligible for overtime", numberOfHours));
            numberOfHours = (numberOfHours - 40) * 2;
        }

        return numberOfHours;
    }

    /**
     * Gets the pay rate
     * @param scanner
     * @return double
     */
    private double getRate(Scanner scanner) {
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        return rate;
    }
}
