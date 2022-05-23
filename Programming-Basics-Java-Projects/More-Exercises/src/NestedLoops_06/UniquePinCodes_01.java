package NestedLoops_06;

import java.util.Scanner;

public class UniquePinCodes_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int roofDigit1 = Integer.parseInt(scanner.nextLine());
        int roofDigit2 = Integer.parseInt(scanner.nextLine());
        int roofDigit3 = Integer.parseInt(scanner.nextLine());

        for (int digit1 = 1; digit1 <= roofDigit1; digit1++) {
            if (digit1 % 2 == 0) {
                for (int digit2 = 1; digit2 <= roofDigit2; digit2++) {
                    if (digit2 == 2 ||
                        digit2 == 3 ||
                        digit2 == 5 ||
                        digit2 == 7) {
                        for (int digit3 = 1; digit3 <= roofDigit3; digit3++) {
                            if (digit3 % 2 == 0) {
                                System.out.printf("%d %d %d%n",
                                    digit1, digit2, digit3);
                            }
                        }
                    }
                }
            }
        }
    }
}