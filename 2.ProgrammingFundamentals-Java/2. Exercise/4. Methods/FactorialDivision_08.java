package methods_04;

import java.util.Scanner;

public class FactorialDivision_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = Long.parseLong(scanner.nextLine());
        long secondNumber = Long.parseLong(scanner.nextLine());

        double output = getFactorial(firstNumber) / getFactorial(secondNumber);
        System.out.printf("%.2f", output);
    }

    private static double getFactorial(long number) {
        long result = 1;
        if (number != 0) {
            for (long i = 1; i <= number; i++) {
                result *= i;
            }
        }
        return result;
    }
}