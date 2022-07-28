package ForLoop_04;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i ++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (max <= num) {
                max = num;
            }
            if (min >= num) {
                min = num;
            }
        }

        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}