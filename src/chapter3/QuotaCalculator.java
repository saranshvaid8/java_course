package chapter3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who do not, they are informed of how many sales they were short.
 */
public class QuotaCalculator {
    public static void main(String args[]) {

        int quota = 10;
       QuotaCalculator quotaCalculator = new QuotaCalculator();
        quotaCalculator.verifySale(quota);
    }

    /**
     * Verifies if a sales person met the sales quota
     * @param quota
     */
    private void verifySale(int quota) {
        System.out.println("How many sales did you make");
        try {
            Scanner scanner = new Scanner(System.in);
            int sales = scanner.nextInt();
            scanner.close();
            //Make a decision on the path to take - output
            if (sales == quota) {
                System.out.println("Congrats! you've met your quota");
            } else if (sales > quota) {
                int aboveQuota = sales - quota;
                System.out.println(String.format("Wow! you sold %d above your quota. Keep up the good work !", aboveQuota));
            } else if (sales < quota) {
                int shortOfQuota = quota - sales;
                System.out.println(String.format("Oh! you were short of %d sales from meeting the sales quota", shortOfQuota));
            } else {
                System.out.printf("Hey do you even sell!");
            }
        }
           catch(InputMismatchException im){
               System.out.printf("The sale number can only be an integers. Please try again");
            }
        }
}


