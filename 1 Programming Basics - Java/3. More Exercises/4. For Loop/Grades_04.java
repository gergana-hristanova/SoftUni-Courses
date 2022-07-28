package ForLoop_04;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberOfStudents = Integer.parseInt(scanner.nextLine());
        int under3 = 0;
        int under4 = 0;
        int under5 = 0;
        int topStudents = 0;
        double gradesSum = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradesSum += grade;

            if (grade < 3) {
                under3++;
            } else if (grade < 4) {
                under4++;
            } else if (grade < 5) {
                under5++;
            } else {
                topStudents++;
            }
        }

        double under3percent = under3 / numberOfStudents * 100;
        double under4percent = under4 / numberOfStudents * 100;
        double under5percent = under5 / numberOfStudents * 100;
        double topStudentsPercent = topStudents / numberOfStudents * 100;
        double averageGrade = gradesSum / numberOfStudents;

        System.out.printf("Top students: %.2f%%%n", topStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", under5percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", under4percent);
        System.out.printf("Fail: %.2f%%%n", under3percent);
        System.out.printf("Average: %.2f", averageGrade);
    }
}