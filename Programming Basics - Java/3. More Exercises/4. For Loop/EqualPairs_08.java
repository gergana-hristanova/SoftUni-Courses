package ForLoop_04;

import java.util.Scanner;

public class EqualPairs_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pairsAmount = Integer.parseInt(scanner.nextLine());
        int lastValue = 0;
        int value = 0;
        int equalPairsCounter = 1;
        int lastDiff = -1;
        boolean equalPairs = false;

        for (int i = 1; i<= pairsAmount; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            value = num1 + num2;
            int diff;

            if (lastValue == value) {
                equalPairsCounter++;
            }
            if (equalPairsCounter == pairsAmount) {
                equalPairs = true;
                break;
            } else if (i > 1) {
                diff = Math.abs(value - lastValue);
                if (diff > lastDiff) {
                    lastDiff = diff;
                }
            }
            lastValue = value;
        }

        if (equalPairs) {
            System.out.printf("Yes, value=%d", value);
        } else {
            System.out.printf("No, maxdiff=%d", lastDiff);
        }
    }
}