package NestedLoops_06;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int num1;
        int num2 = 0;
        int combinationNumber = 0;
        boolean combinationFound = false;

        for (num1 = start; num1 <= end; num1++) {
            for (num2 = start; num2 <= end; num2++) {
                combinationNumber++;
                if (num1 + num2 == magicNumber) {
                    combinationFound = true;
                    break;
                }
            }
            if (combinationFound) {
                break;
            }
        }

        if (combinationFound) {
            System.out.printf("Combination N:%d ", combinationNumber);
            System.out.printf("(%d + %d = %d)%n",
                    num1, num2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d",
                    combinationNumber, magicNumber);
        }
    }
}