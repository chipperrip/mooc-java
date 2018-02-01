
import java.util.Scanner;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chip
 */
public class Course {

    private int[] grades;

    public Course() {
        int[] grades = {0, 0, 0, 0, 0, 0};
        this.grades = grades;
    }

    public void newGrades(Scanner reader) {
        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }

            if (input >= 0 && input <= 60) {
                if (input <= 29) {
                    grades[0]++;
                } else if (input <= 34) {
                    grades[1]++;
                } else if (input <= 39) {
                    grades[2]++;
                } else if (input <= 44) {
                    grades[3]++;
                } else if (input <= 49) {
                    grades[4]++;
                } else if (input <= 60) {
                    grades[5]++;
                }
            }

        }

        printGrades();
    }

    public int numberOfGrades() {
        int number = 0;

        for (int grades : grades) {
            number += grades;
        }
        return number;
    }

    public int acceptedGrades() {

        int number = 0;

        for (int i = 1; i < grades.length; i++) {
            number += grades[i];

        }

        return number;
    }

    public void printGrades() {

        System.out.println("Grades Distribution: ");
        int gradeNumber = 5;
        for (int i = grades.length - 1; i >= 0; i--) {
            System.out.println(gradeNumber + ": " + StringUtils.printStars(grades[i]));
            gradeNumber--;
        }
        System.out.println("Acceptance percentage: " + (((double) 100 * acceptedGrades()) / numberOfGrades()));
    }

}
