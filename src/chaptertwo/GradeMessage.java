package chaptertwo;

import java.util.Scanner;

/**
 *

 */
public class GradeMessage {


    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        GradeMessage gradeMessage = new GradeMessage();
        gradeMessage.gradeChecker(grade);


    }

    /**
     * Checks for grade using a switch statement and prints a message to the console
     * @param grade
     */
    private  void gradeChecker(String grade) {
        String message;
        switch (grade) {
            case "A":
                message = "Do you even play ?";
                break;
            case "B":
                message = "You are a half & half";
                break;
            case "C":
                message = "Decide what you want to be";
                break;
            case "D":
                message = "I know you definitely do not like the concept of school, but you also do not want to be without a degree";
                break;
            case "F":
                message= "You are awesome ! you really are a REBEL";
                break;
            default:
                message = "Err.. what are you looking for ?";
        }

        System.out.println(message);
    }
}
