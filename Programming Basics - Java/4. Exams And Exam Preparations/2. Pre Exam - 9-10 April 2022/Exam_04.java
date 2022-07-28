package PreExamApril2022;

import java.util.Scanner;

public class Exam_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double students = Integer.parseInt(scanner.nextLine());

        int failedStudents = 0;
        int between3and4 = 0;
        int between4and5 = 0;
        int topStudents = 0;
        double gradesSum = 0;

        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradesSum += grade;
            if (grade < 3) {
                failedStudents++;
            } else if (grade < 4) {
                between3and4++;
            } else if(grade < 5) {
                between4and5++;
            } else {
                topStudents++;
            }
        }

        System.out.printf("Top students: %.2f%%%n", topStudents / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4and5 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between3and4 / students * 100);
        System.out.printf("Fail: %.2f%%%n", failedStudents / students * 100);
        System.out.printf("Average: %.2f", gradesSum / students);
    }
}