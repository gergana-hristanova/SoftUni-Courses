package NestedLoops_06;

import java.util.Scanner;

public class ChallengeTheWedding_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menAmount = Integer.parseInt(scanner.nextLine());
        int womenAmount = Integer.parseInt(scanner.nextLine());
        int tablesAmount = Integer.parseInt(scanner.nextLine());
        int takenTablesCounter = 0;
        boolean allTablesTaken = false;

            for (int manNumber = 1; manNumber <= menAmount; manNumber++) {
                for (int womanNumber = 1; womanNumber <= womenAmount; womanNumber++) {
                    if (takenTablesCounter == tablesAmount) {
                        allTablesTaken = true;
                        break;
                    } else {
                        System.out.printf("(%d <-> %d) ", manNumber, womanNumber);
                        takenTablesCounter++;
                    }
                }
                if (allTablesTaken) {
                    break;
                }
            }
    }
}