package NestedLoops_06;

import java.util.Scanner;

public class SecretDoorLock_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int digit1Roof = Integer.parseInt(scanner.nextLine());
        int digit2Roof = Integer.parseInt(scanner.nextLine());
        int digit3Roof = Integer.parseInt(scanner.nextLine());

        for (int digit1 = 1; digit1 <= digit1Roof; digit1++) {
            for (int digit2 = 1; digit2 <= digit2Roof; digit2++) {
                for (int digit3 = 1; digit3 <= digit3Roof; digit3++) {
                    if (digit1 % 2 == 0 && digit3 % 2 == 0) {
                        if (digit2 == 2 ||
                            digit2 == 3 ||
                            digit2 == 5 ||
                            digit2 == 7) {
                            System.out.printf("%d %d %d%n", digit1, digit2, digit3);
                        }
                    }
                }
            }
        }
    }
}