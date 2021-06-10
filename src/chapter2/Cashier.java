package chapter2;

import java.util.Scanner;

/**
 * Using FOR Loop:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */
public class Cashier {
    public static void main(String[] args) {
        //Get number of items to scan
        System.out.println("Please enter the number of items you would like to scan");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.println(String.format("Please enter the cost of item no :%d", i + 1));
            double price = scanner.nextDouble();
            total += price;
        }
        if (quantity==0)
            System.out.println("I am sorry that you were unable to find what you were looking for in our store");
        else{
            System.out.println("Your total is $"+ total);
            System.out.println("Thank you for stopping by!");
        }

    }
}
