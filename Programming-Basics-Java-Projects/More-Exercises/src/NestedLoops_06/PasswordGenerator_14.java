package NestedLoops_06;

import java.util.Scanner;

public class PasswordGenerator_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for (int digit1 = 1; digit1 <= n; digit1++) {
            for (int digit2 = 1; digit2 <= n; digit2++) {
                for (char digit3 = 'a'; digit3 <= l + 96; digit3++) {
                    for (char digit4 = 'a'; digit4 <= l + 96; digit4++) {
                        for (int digit5 = 1; digit5 <= n; digit5++) {
                            if (digit5 > digit1 && digit5 > digit2) {
                                System.out.printf("%d%d%s%s%d ",
                                        digit1, digit2, digit3, digit4, digit5);
                            }
                        }
                    }
                }
            }
        }
    }
}