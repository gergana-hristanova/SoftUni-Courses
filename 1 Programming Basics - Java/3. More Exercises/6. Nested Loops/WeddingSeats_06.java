package NestedLoops_06;

import java.util.Scanner;

public class WeddingSeats_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lastSector = scanner.nextLine();
        int rowsInSectorA = Integer.parseInt(scanner.nextLine());
        int seatsPerOddRow = Integer.parseInt(scanner.nextLine());
        int seatsCounter = 0;

        for (char sector = 'A'; sector <= lastSector.charAt(0); sector++) {
            int seatsPerRow;
            for (int row = 1; row <= rowsInSectorA; row++) {
                if (row % 2 == 0) {
                    seatsPerRow = seatsPerOddRow + 2;
                } else {
                    seatsPerRow = seatsPerOddRow;
                }
                    for (char seat = 'a'; seatsPerRow > 0; seat++) {
                        System.out.printf("%s%d%s%n", sector, row, seat);
                        seatsCounter++;
                        seatsPerRow--;
                }
            }
            rowsInSectorA++;
        }
        System.out.println(seatsCounter);
    }
}