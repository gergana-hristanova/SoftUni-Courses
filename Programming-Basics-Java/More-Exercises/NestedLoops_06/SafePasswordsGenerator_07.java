package NestedLoops_06;

import java.util.Scanner;

public class SafePasswordsGenerator_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int xRoof = Integer.parseInt(scanner.nextLine());
        int yRoof = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int passwordsCounter = 0;

        char A = 35;
        char B = 64;

        for (int x = 1; x <= xRoof; x++) {
            for (int y = 1; y <= yRoof; y++) {
                if (passwordsCounter == maxPasswords) {
                    break;
                } else {
                    System.out.printf("%s%s%d%d%s%s|", A, B, x, y, B, A);
                    A++;
                    B++;
                    passwordsCounter++;

                    if (A > 55) {
                        A = 35;
                    }
                    if (B > 96) {
                        B = 64;
                    }
                }
            }
        }
    }
}