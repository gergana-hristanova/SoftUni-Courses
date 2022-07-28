package NestedLoops_06;

import java.util.Scanner;

public class PrimePairs_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pair1Floor = Integer.parseInt(scanner.nextLine());
        int pair2Floor = Integer.parseInt(scanner.nextLine());
        int pair1RoofDiff = Integer.parseInt(scanner.nextLine());
        int pair2RoofDiff = Integer.parseInt(scanner.nextLine());
        int pair1Roof = pair1Floor + pair1RoofDiff;
        int pair2Roof = pair2Floor + pair2RoofDiff;

        int pair1DivisionsCounter = 0;
        int pair2DivisionsCounter = 0;

        for (int pair1 = pair1Floor; pair1 <= pair1Roof; pair1++) {
            for (int primeChecker1 = 1; primeChecker1 <= pair1; primeChecker1++) {
                if (pair1 % primeChecker1 == 0) {
                    pair1DivisionsCounter++;
                }
            }
            if (pair1DivisionsCounter == 2) {
                for (int pair2 = pair2Floor; pair2 <= pair2Roof; pair2++) {
                    for (int primeChecker2 = 1; primeChecker2 <= pair2; primeChecker2++) {
                        if (pair2 % primeChecker2 == 0) {
                            pair2DivisionsCounter++;
                        }
                    }
                    if (pair2DivisionsCounter == 2) {
                        System.out.printf("%d%d%n", pair1, pair2);
                    } else {
                        pair2DivisionsCounter = 0;
                    }
                }
            } else {
                pair1DivisionsCounter = 0;
            }
        }
    }
}