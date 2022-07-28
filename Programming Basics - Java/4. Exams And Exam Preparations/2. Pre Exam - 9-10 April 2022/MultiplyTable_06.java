package PreExamApril2022;

import java.util.Scanner;

public class MultiplyTable_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        int digit1Roof = inputNumber % 10;
        inputNumber /= 10;
        int digit2Roof = inputNumber % 10;
        inputNumber /= 10;
        int digit3Roof = inputNumber % 10;

        for (int digit1 = 1; digit1 <= digit1Roof; digit1++) {
            for (int digit2 = 1; digit2 <= digit2Roof; digit2++) {
                for (int digit3 = 1; digit3 <= digit3Roof; digit3++) {
                    System.out.printf("%d * %d * %d = %d;%n",
                            digit1, digit2, digit3, digit1 * digit2 * digit3);
                }
            }
        }
    }
}