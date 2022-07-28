package DataTypesAndVariables_02;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        short sum = 0;
        while (input != 0) {
            byte currentDigit = (byte) (input % 10);
            sum += currentDigit;
            input /= 10;
        }

        System.out.println(sum);
    }
}