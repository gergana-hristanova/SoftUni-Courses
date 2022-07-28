package DataTypesAndVariables_02;

import java.util.Scanner;

public class RefactoringPrimeChecker_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int currentNumber = 2; currentNumber <= n; currentNumber++) {
            boolean isPrime = true;
            for (int primeChecker = 2; primeChecker < currentNumber; primeChecker++) {
                if (currentNumber % primeChecker == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", currentNumber, isPrime);
        }
    }
}