package ForLoop_04;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (max <= num) {
                max = num;
            }
        }

        sum -= max;
        if (sum == max) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - max));
        }
    }
}