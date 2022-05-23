package NestedLoops_06;

import java.util.Scanner;

public class SumOfTwoNumbers_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberFloor = Integer.parseInt(scanner.nextLine());
        int numberRoof = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationsCounter = 0;
        boolean combinationFound = false;
        for (int num1 = numberFloor; num1 <= numberRoof; num1++) {
            for (int num2 = numberFloor; num2 <= numberRoof; num2++) {
                combinationsCounter++;
                if (num1 + num2 == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            combinationsCounter, num1, num2, magicNumber);
                    combinationFound = true;
                    break;
                }
            }
            if (combinationFound) {
                break;
            }
        }
        if (!combinationFound) {
            System.out.printf("%d combinations - neither equals %d",
                    combinationsCounter, magicNumber);
        }
    }
}