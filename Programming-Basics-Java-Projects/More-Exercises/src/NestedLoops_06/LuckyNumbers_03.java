package NestedLoops_06;

import java.util.Scanner;

public class LuckyNumbers_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int digit1 = 1; digit1 <= 9; digit1++) {
            for (int digit2 = 1; digit2 <= 9; digit2++) {
                for (int digit3 = 1; digit3 <= 9; digit3++) {
                    for (int digit4 = 1; digit4 <= 9; digit4++) {
                        if (digit1 + digit2 == digit3 + digit4) {
                            int sum = digit1 + digit2;
                            if (n % sum == 0) {
                                System.out.printf("%d%d%d%d ",
                                        digit1, digit2, digit3, digit4);
                            }
                        }
                    }
                }
            }
        }
    }
}