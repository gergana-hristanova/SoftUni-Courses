package NestedLoops_06;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean isNonPrime = false;

        while (!input.equals("stop")) {

            int inputNumber = Integer.parseInt(input);
            if (inputNumber < 0) {
                System.out.println("Number is negative.");
            } else {
                for (int i = 2; i < inputNumber; i++) {
                    if (inputNumber % i == 0) {
                        isNonPrime = true;
                        break;
                    }
                }
                if (isNonPrime) {
                    nonPrimeSum += inputNumber;
                } else {
                    primeSum += inputNumber;
                }
            }
            isNonPrime = false;
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}