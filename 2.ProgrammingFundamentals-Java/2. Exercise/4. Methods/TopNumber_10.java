package methods_04;

import java.util.Scanner;

public class TopNumber_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isSumDigitsDivisibleBy8(i) && holdsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isSumDigitsDivisibleBy8(int number) {
        int sumDigits = 0;
        while (number > 0) {
            sumDigits += number % 10;
            number /= 10;
        }

        return sumDigits % 8 == 0;
    }

    private static boolean holdsOddDigit(int number) {
        while(number > 0) {
            byte currentDigit = (byte) (number % 10);
            if (currentDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}