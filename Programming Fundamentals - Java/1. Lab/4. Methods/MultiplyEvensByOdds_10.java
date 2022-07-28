package methods_04;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(multiplySumsOfEvensAndOdds(input));
    }

    public static int getSumOfEvens(int numberEvens) {
        int sum = 0;
        while(numberEvens > 0) {
            byte currentDigit = (byte) (numberEvens % 10);
            if (currentDigit % 2 == 0) {
                sum += currentDigit;
            }
            numberEvens /= 10;
        }
        return sum;
    }

    public static int getSumOfOdds(int numberOdds) {
        int sum = 0;
        while(numberOdds > 0) {
            byte currentDigit = (byte) (numberOdds % 10);
            if (currentDigit % 2 != 0) {
                sum += currentDigit;
            }
            numberOdds /= 10;
        }
        return sum;
    }

    public static int multiplySumsOfEvensAndOdds(int number) {
        int evensSum = getSumOfEvens(number);
        int oddsSum = getSumOfOdds(number);
        return evensSum * oddsSum;
    }
}