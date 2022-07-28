package NestedLoops_06;

import java.util.Scanner;

public class TheSongOfTheWheels_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());
        int passwordsCounter = 0;
        String rightPassword = "No!";
        boolean rightPasswordNotFound = true;

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (a < b && c > d) {
                            if (a * b + c * d == M) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                passwordsCounter++;
                            }
                            if (passwordsCounter == 4 && rightPasswordNotFound) {
                                rightPassword = "Password: " + a + b + c + d;
                                rightPasswordNotFound = false;
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("%n%s", rightPassword);
    }
}