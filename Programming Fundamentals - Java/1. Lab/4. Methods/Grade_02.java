package methods_04;

import java.util.Scanner;

public class Grade_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        gradeChecker(grade);
    }

    public static void gradeChecker(double grade) {
        if (2 <= grade && grade <= 2.99) {
            System.out.println("Fail");
        } else if (3 <= grade && grade <= 3.49) {
            System.out.println("Poor");
        }  else if (3.50 <= grade && grade <= 4.49) {
            System.out.println("Good");
        } else if (4.50 <= grade && grade <= 5.49) {
            System.out.println("Very good");
        } else if (5.50 <= grade && grade <= 6) {
            System.out.println("Excellent");
        }
    }
}