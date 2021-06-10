package chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Nested Loops
 * Find the average of each student's test scores
 */
public class AverageTestScores {
    public static void main(String[] args) {
        int numberOfStudents = 2;
        int numberOfTests=4;
        AverageTestScores averageTestScores = new AverageTestScores();

        averageTestScores.calculateTestAverage(numberOfStudents, numberOfTests);
    }

    /**
     * Calculates the average score
     * @param numberOfStudents
     * @param numberOfTests
     */
    private void calculateTestAverage(int numberOfStudents, int numberOfTests) {
        List<String> studentNames = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Please enter your name:");
            String name = scanner.next();
            studentNames.add(name);
            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {

                System.out.println(String.format("Please enter the total marks scored on test no. %d ",j+1));
                double score = scanner.nextDouble();
                total += score;
            }

            double average = total/ numberOfTests;
            System.out.println(String.format("The average marks scored by %s is %s", studentNames.get(i),average));
        }
        scanner.close();
    }
}
