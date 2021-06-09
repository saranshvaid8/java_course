package chaptertwo;

import java.util.Scanner;

/**
 * To qualify for a loan, a person must make at least 30,000$ a year
 * and have been working at their current job for at least 2 years
 */
public class LoanQualifier {
    public static void main(String[] args) {

        LoanQualifier loanQualifier = new LoanQualifier();
        int requiredSalary = 30000;
        int requiredYears = 2;
         loanQualifier.verifyLoanQualification(requiredSalary,requiredYears);
    }

    /**
     * Verifies if a person qualifies for a loan
     * @param requiredSalary
     * @param requiredYears
     */
    private void verifyLoanQualification(int requiredSalary, int requiredYears) {
        System.out.println("Please enter your salary for verification");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Please enter the number of years you have been employed at your current job");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary>=requiredSalary){
            if (years>=requiredYears){
                System.out.println("Congrats! you would qualify for the loan.");
            }
            else{
                System.out.println(String.format("Sorry ! you should have worked at your current job for at least %s year",requiredYears));
            }

        }else {
            System.out.println(String.format("Sorry! you do not qualify for the the loan as your salary is less than %s $ ", requiredSalary));
        }
    }
}
