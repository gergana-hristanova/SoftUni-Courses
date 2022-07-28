package ForLoop_04;

import java.util.Scanner;

public class OddEvenPosition_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersAmount = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= numbersAmount; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        //има и по-добри начини да се напише следващата част от кода,
        //но е много късно, затова избирам а ги игнорирам
        if (numbersAmount == 1) {
            System.out.printf("OddSum=%.2f,%n" +
                              "OddMin=%.2f,%n" +
                              "OddMax=%.2f,%n" +
                              "EvenSum=%.2f,%n" +
                              "EvenMin=No,%n" +
                              "EvenMax=No",
                    oddSum, oddMin, oddMax, evenSum);
        } else if (numbersAmount == 0) {
            System.out.printf("OddSum=%.2f,%n" +
                              "OddMin=No,%n" +
                              "OddMax=No,%n" +
                              "EvenSum=%.2f,%n" +
                              "EvenMin=No,%n" +
                              "EvenMax=No",
                    oddSum, evenSum);
        } else {
            System.out.printf("OddSum=%.2f,%n" +
                              "OddMin=%.2f,%n" +
                              "OddMax=%.2f,%n" +
                              "EvenSum=%.2f,%n" +
                              "EvenMin=%.2f,%n" +
                              "EvenMax=%.2f",
                    oddSum, oddMin, oddMax, evenSum, evenMin, evenMax);
        }
    }
}